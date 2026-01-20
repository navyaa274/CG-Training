package Jan20;

public class Question2 {
    public static void main(String[] args) {
        System.out.println("=== E-Commerce Platform Demo ===");

        Product[] products = {
                new Electronics(1, "Laptop", 1000.0),
                new Clothing(2, "T-Shirt", 50.0),
                new Groceries(3, "Milk", 5.0)
        };

        for (Product p : products) {
            double price   = p.getPrice();
            double disc    = p.calculateDiscount();
            double tax     = p.calculateTax();
            double finalP  = p.getFinalPrice();

            System.out.println(p.toString());
            System.out.println("  Price      : " + price);
            System.out.println("  Discount   : " + disc);
            System.out.println("  Tax        : " + tax);
            System.out.println("  Final Price: " + finalP);

            if (p instanceof Taxable) {
                System.out.println("  Tax detail : " + ((Taxable) p).getTaxDetails());
            } else {
                System.out.println("  Tax detail : Not taxable category");
            }
            System.out.println();
        }
    }
}

// q2: E-Commerce Platform

abstract class Product {
    private int productId;
    private String name;
    private double price;

    public Product(int productId, String name, double price) {
        this.productId = productId;
        this.name = name;
        this.price  = price;
    }

    // Abstract: subclasses must provide discount logic
    public abstract double calculateDiscount();

    // Abstract: subclasses must provide tax logic
    public abstract double calculateTax();

    public double getFinalPrice() {
        return (price + calculateTax()) - calculateDiscount();
    }

    // Getters + controlled update
    public int getProductId() {
        return productId;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    // Encapsulation: change price only via setter
    public void setPrice(double price) {
        this.price = price;
    }
}

// For explanation: some categories are taxable
interface Taxable {
    double calculateTax();
    default String getTaxDetails() {
        return "Standard tax rules applied.";
    }
}

class Electronics extends Product implements Taxable {
    public Electronics(int id, String name, double price) {
        super(id, name, price);
    }

    @Override
    public double calculateDiscount() {
        // 10% discount
        return getPrice() * 0.10;
    }

    @Override
    public double calculateTax() {
        // 5% tax
        return getPrice() * 0.05;
    }

    @Override
    public String toString() {
        return "Electronics: " + getName();
    }
}

class Clothing extends Product implements Taxable {
    public Clothing(int id, String name, double price) {
        super(id, name, price);
    }

    @Override
    public double calculateDiscount() {
        // 20% discount
        return getPrice() * 0.20;
    }

    @Override
    public double calculateTax() {
        // 12% tax
        return getPrice() * 0.12;
    }

    @Override
    public String toString() {
        return "Clothing: " + getName();
    }
}

class Groceries extends Product {
    public Groceries(int id, String name, double price) {
        super(id, name, price);
    }

    @Override
    public double calculateDiscount() {
        // No discount for this example
        return 0;
    }

    @Override
    public double calculateTax() {
        // No tax for this example
        return 0;
    }

    @Override
    public String toString() {
        return "Groceries: " + getName();
    }
}