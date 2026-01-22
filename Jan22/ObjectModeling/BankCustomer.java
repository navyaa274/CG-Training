package Jan22.ObjectModeling;

public class BankCustomer {
    public static void main(String[] args) {
        Customer cust = new Customer("Ram", 10000);
        Bank bank = new Bank("AXIS");
        bank.openAccount(cust);
        System.out.println("Balance: " + cust.viewBalance());
    }
}

class Customer {
    String name;
    double balance;
    Customer(String name, double balance) {
        this.name = name;
        this.balance = balance;
    }
    public double viewBalance() {
        return balance;
    }
}

class Bank {
    String name;
    Bank(String name) {
        this.name = name;
    }
    void openAccount(Customer c) {
        System.out.println("Opened account for " + c.name + " at " + name);
    }  // Association communication
}