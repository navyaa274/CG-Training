package Jan15.Level2Assignment;

/*
Q2: Create a BankAccount class with attributes accountHolder, accountNumber, and
balance. Add methods for:
Depositing money.
Withdrawing money (only if sufficient balance exists).
Displaying the current balance
 */

class BankAccount {
    String accountHolder, accountNumber;
    double balance;

    void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.printf("Deposited ₹%.2f. New balance: ₹%.2f%n", amount, balance);
        } else {
            System.out.println("Invalid deposit amount");
        }
    }

    void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.printf("Withdrew ₹%.2f. New balance: ₹%.2f%n", amount, balance);
        } else {
            System.out.println("Insufficient balance or invalid amount");
        }
    }

    void displayBalance() {
        System.out.printf("Account: %s (%s), Balance: ₹%.2f%n",
                accountHolder, accountNumber, balance);
    }
}

public class Question2 {
    public static void main(String[] args) {
        BankAccount acc = new BankAccount();
        acc.accountHolder = "John Doe";
        acc.accountNumber = "ACC001";
        acc.balance = 1000;

        acc.displayBalance();
        acc.deposit(500);
        acc.withdraw(200);
        acc.withdraw(1500); // Test insufficient balance
        acc.displayBalance();
    }
}