package Jan20;

public class Question4 {
    public static void main(String[] args) {
        System.out.println("=== Banking System Demo ===");

        BankAccount[] accounts = {
                new SavingsAccount("S001", "Alice Saver", 10000),
                new CurrentAccount("C001", "Bob Current", 5000)
        };

        double loanRequest = 8000;

        for (BankAccount acc : accounts) {
            System.out.println("\nAccount: " + acc.getAccountNumber()
                    + " | Holder: " + acc.getHolderName());
            System.out.println("Current balance: " + acc.getBalance());

            double interest = acc.calculateInterest();
            System.out.println("Calculated interest: " + interest);

            Loanable loanable = (Loanable) acc;
            System.out.println("Loan rule: " + loanable.calculateLoanEligibility());
            System.out.println("Applying for loan: " + loanRequest);
            boolean approved = loanable.applyForLoan(loanRequest);
            System.out.println("Loan approved? " + approved);
        }

        System.out.println();
    }
}

abstract class BankAccount {
    private String accountNumber;
    private String holderName;
    private double balance;

    public BankAccount(String accountNumber, String holderName, double balance) {
        this.accountNumber = accountNumber;
        this.holderName = holderName;
        this.balance = balance;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
        }
    }

    public abstract double calculateInterest(); // to be overridden

    // Encapsulated getters (no direct balance change from outside)
    public String getAccountNumber() {
        return accountNumber;
    }

    public String getHolderName() {
        return holderName;
    }

    public double getBalance() {
        return balance;
    }

    // Protected helper if subclasses need to adjust balance internally
    protected void setBalance(double balance) {
        this.balance = balance;
    }
}

// Interface for loan-related behavior
interface Loanable {
    boolean applyForLoan(double amount);
    String calculateLoanEligibility();
}

class SavingsAccount extends BankAccount implements Loanable {

    public SavingsAccount(String num, String name, double bal) {
        super(num, name, bal);
    }

    @Override
    public double calculateInterest() {
        // 4% annual interest
        return getBalance() * 0.04;
    }

    @Override
    public boolean applyForLoan(double amount) {
        // Eligible if balance is at least 50% of requested loan
        return getBalance() >= amount * 0.5;
    }

    @Override
    public String calculateLoanEligibility() {
        return "SavingsAccount: Eligible if balance >= 50% of loan amount.";
    }
}

class CurrentAccount extends BankAccount implements Loanable {

    public CurrentAccount(String num, String name, double bal) {
        super(num, name, bal);
    }

    @Override
    public double calculateInterest() {
        // 2% annual interest
        return getBalance() * 0.02;
    }

    @Override
    public boolean applyForLoan(double amount) {
        // Eligible if balance is at least 30% of requested loan
        return getBalance() >= amount * 0.3;
    }

    @Override
    public String calculateLoanEligibility() {
        return "CurrentAccount: Eligible if balance >= 30% of loan amount.";
    }
}

