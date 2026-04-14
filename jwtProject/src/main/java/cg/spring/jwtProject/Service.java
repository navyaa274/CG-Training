package cg.spring.jwtProject;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.crypto.password.PasswordEncoder;

import java.util.concurrent.ThreadLocalRandom;

@org.springframework.stereotype.Service
public class Service {

    @Autowired
    Repo repo;

    @Autowired
    PasswordEncoder encoder;

    @Autowired
    AuthenticationManager authenticationManager;

    @Autowired
    JWTBuilder jwtBuilder;


    private Customer getAuthenticatedCustomer() {

        Authentication authentication = SecurityContextHolder
                .getContext()
                .getAuthentication();

        if (authentication == null || !authentication.isAuthenticated()) {
            throw new RuntimeException("USER NOT AUTHENTICATED");
        }

        String username = authentication.getName();

        Customer customer = repo.findByUsername(username);

        if (customer == null) {
            throw new RuntimeException("USER NOT FOUND");
        }

        return customer;
    }

    private boolean validatePassword(String password, String hashedPassword) {
        return encoder.matches(password, hashedPassword);
    }


    public String signup(Customer customer) {
        if(customer.getInitialDeposit() < 1000)
            return "MINIMUM DEPOSIT AMOUNT IS 1000";

        customer.setPassword(encoder.encode(customer.getPassword()));
        customer.setBalance(customer.getInitialDeposit());

        repo.save(customer);

        String idFormatted = "";
        int digits = String.valueOf(customer.getId()).length();
        if (digits > 5)
            idFormatted = (customer.getId() / (int)Math.pow(10, digits - 5)) + "";
        else if (digits < 5)
            idFormatted = (customer.getId() * (int)Math.pow(10, 5 - digits)) + "";
        else
            idFormatted = customer.getId() + "";

        int random = ThreadLocalRandom.current().nextInt(0, 100000);
        String randomFormatted = String.format("%05d", random);

        customer.setAccNo(idFormatted + randomFormatted);
        repo.save(customer);

        return "ACCOUNT CREATED SUCCESSFULLY" + "\nACCOUNT NO. : " + customer.getAccNo();
    }

    public String login( Customer customer) {
        UsernamePasswordAuthenticationToken token = new UsernamePasswordAuthenticationToken
                (customer.getUsername(), customer.getPassword());

        Authentication authentication;

        try{
            authentication =  authenticationManager.authenticate(token);
        }
        catch(BadCredentialsException e){
            return "INVALID CREDENTIALS";
        }

        String username = authentication.getName();
        String jwt = jwtBuilder.generateToken(username);

        return "YOUR JWT TOKEN IS: " + jwt;
    }

    public String debitCard() {
        Customer customer = getAuthenticatedCustomer();

        if (customer.isDebitCard()) {
            return "DEBIT CARD ALREADY ISSUED";
        }

        customer.setDebitCard(true);
        repo.save(customer);

        return "DEBIT CARD ISSUED";
    }

    public String chequeBook() {
        Customer customer = getAuthenticatedCustomer();

        return ("PREVIOUSLY ISSUED CHEQUE BOOKS : " + customer.getChequeBook() +
                "\n TO ISSUE NEW GO TO localhost:8080/cheque-book/issue");
    }

    public String chequeBookIssue(){
        Customer customer = getAuthenticatedCustomer();

        customer.setChequeBook(customer.getChequeBook() + 1);
        repo.save(customer);

        return "NEW CHEQUE BOOK ISSUED";
    }

    public String passBook() {
        Customer customer = getAuthenticatedCustomer();

        return ("PREVIOUSLY ISSUED PASS BOOKS : " + customer.getPassBook() +
                "\n TO ISSUE NEW GO TO localhost:8080/pass-book/issue");
    }

    public String passBookIssue(){
        Customer customer = getAuthenticatedCustomer();

        customer.setPassBook(customer.getPassBook() + 1);
        repo.save(customer);

        return "NEW PASS BOOK ISSUED";
    }

    public String balance() {
        Customer customer = getAuthenticatedCustomer();

        return "YOUR ACCOUNT BALANCE IS : "  + customer.getBalance();
    }

    public String deposit(TransactionDTO transactionDTO) {
        Customer customer = getAuthenticatedCustomer();

        if(!validatePassword(transactionDTO.getPassword(), customer.getPassword()))
            return "INVALID PASSWORD";

        if (transactionDTO.getAmount() <= 0) {
            return "INVALID AMOUNT";
        }

        customer.setBalance(customer.getBalance() + transactionDTO.getAmount());
        repo.save(customer);

        return "DEPOSIT SUCCESSFUL. NEW BALANCE: " + customer.getBalance();
    }

    public String withdraw(TransactionDTO transactionDTO) {
        Customer customer = getAuthenticatedCustomer();

        if(!validatePassword(transactionDTO.getPassword(), customer.getPassword()))
            return "INVALID PASSWORD";

        if (transactionDTO.getAmount() <= 0) {
            return "INVALID AMOUNT";
        }
        if(transactionDTO.getAmount() > customer.getBalance())
            throw new RuntimeException("INSUFFICIENT FUNDS");

        customer.setBalance(customer.getBalance() - transactionDTO.getAmount());
        repo.save(customer);

        return "WITHDRAW SUCCESSFUL. NEW BALANCE: " + customer.getBalance();
    }

    public String transfer(TransactionDTO transactionDTO ) {
        Customer customer = getAuthenticatedCustomer();

        if(!customer.getAccNo().equals(transactionDTO.getFrom()))
            return "INVALID ACCOUNT NUMBER, PLEASE ENTER YOUR ACCOUNT NUMBER";

        Customer receiver = repo.findByAccNo(transactionDTO.getTo());
        if(receiver == null)
            return "INVALID RECEIVER ACCOUNT NUMBER";

        if(!validatePassword(transactionDTO.getPassword(), customer.getPassword()))
            return "INVALID PASSWORD";

        if (transactionDTO.getAmount() <= 0) {
            return "INVALID AMOUNT";
        }

        if(transactionDTO.getAmount() > customer.getBalance())
            throw new RuntimeException("INSUFFICIENT FUNDS");

        customer.setBalance(customer.getBalance() - transactionDTO.getAmount());
        repo.save(customer);

        receiver.setBalance(receiver.getBalance() + transactionDTO.getAmount());
        repo.save(receiver);

        return "AMOUNT TRANSFERRED SUCCESSFULLY";
    }

    public String changePassword(TransactionDTO transactionDTO) {
        Customer customer = getAuthenticatedCustomer();

        if(!validatePassword(transactionDTO.getOldPassword(), customer.getPassword()))
            return "INVALID PASSWORD";

        customer.setPassword(encoder.encode(transactionDTO.getNewPassword()));
        repo.save(customer);

        return "PASSWORD CHANGED SUCCESSFULLY";
    }

    public String changeInfo(Customer customer) {
        Customer c = getAuthenticatedCustomer();

        if(!validatePassword(customer.password, c.getPassword()))
            return "INVALID PASSWORD";

        if(customer.getEmail() != null && !customer.getEmail().equals(c.getEmail()))
            c.setEmail(customer.getEmail());
        if(customer.getMobile() != null && !customer.getMobile().equals(c.getMobile()))
            c.setMobile(customer.getMobile());

        repo.save(c);

        return "INFO CHANGED SUCCESSFULLY";
    }

    public String close(TransactionDTO transactionDTO) {
        Customer customer = getAuthenticatedCustomer();

        if (!validatePassword(transactionDTO.getPassword(), customer.getPassword())) {
            return "INVALID PASSWORD";
        }

        if (customer.getBalance() > 0) {
            return "PLEASE WITHDRAW BALANCE BEFORE CLOSING ACCOUNT";
        }

        repo.delete(customer);

        return "ACCOUNT CLOSED SUCCESSFULLY";
    }

}
