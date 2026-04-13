package cg.spring.jwtProject;

import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

@Entity
public class Customer {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    int id;

    @Column(unique = true)
    @NotBlank
    @Size(min = 5, max = 20)
    String username;

    String password;
    String name;
    @Size(min = 10, max = 10)
    String mobile;

    @Email
    @NotBlank
    String email;

    double initialDeposit;
    double balance;
    String accNo;

    boolean debitCard;
    int chequeBook = 1;
    int passBook = 1;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public double getInitialDeposit() {
        return initialDeposit;
    }

    public void setInitialDeposit(double initialDeposit) {
        this.initialDeposit = initialDeposit;
    }

    public String getAccNo() {
        return accNo;
    }

    public void setAccNo(String accNo) {
        this.accNo = accNo;
    }

    public boolean isDebitCard() {
        return debitCard;
    }

    public void setDebitCard(boolean debitCard) {
        this.debitCard = debitCard;
    }

    public int getChequeBook() {
        return chequeBook;
    }

    public void setChequeBook(int chequeBook) {
        this.chequeBook = chequeBook;
    }

    public int getPassBook() {
        return passBook;
    }

    public void setPassBook(int passBook) {
        this.passBook = passBook;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
}
