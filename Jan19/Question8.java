package Jan19;

public class Question8 {
    public static void main(String[] args) {
        BankAccount[] accounts = {
                new SavingsAccount("SAV001", 5000, 3.5),
                new CheckingAccount("CHK001", 2000, 1000),
                new FixedDepositAccount("FD001", 10000, 24)
        };

        for (BankAccount account : accounts) {
            account.displayAccountType();
            System.out.println();
        }
    }
}

class BankAccount {
    protected String accountNumber; protected double balance;
    public BankAccount(String accNo, double balance) {
        this.accountNumber = accNo; this.balance = balance;
    }
    public void displayAccountType() {
        System.out.println("Account: " + accountNumber + " | Balance: $" + balance);
    }
}

class SavingsAccount extends BankAccount {
    private double interestRate;
    public SavingsAccount(String accNo, double balance, double rate) {
        super(accNo, balance); this.interestRate = rate;
    }
    @Override public void displayAccountType() {
        super.displayAccountType();
        System.out.println("Type: Savings | Interest: " + interestRate + "%");
    }
}

class CheckingAccount extends BankAccount {
    private double withdrawalLimit;
    public CheckingAccount(String accNo, double balance, double limit) {
        super(accNo, balance); this.withdrawalLimit = limit;
    }
    @Override public void displayAccountType() {
        super.displayAccountType();
        System.out.println("Type: Checking | Limit: $" + withdrawalLimit);
    }
}

class FixedDepositAccount extends BankAccount {
    private int tenureMonths;
    public FixedDepositAccount(String accNo, double balance, int tenure) {
        super(accNo, balance); this.tenureMonths = tenure;
    }
    @Override public void displayAccountType() {
        super.displayAccountType();
        System.out.println("Type: Fixed Deposit | Tenure: " + tenureMonths + " months");
    }
}