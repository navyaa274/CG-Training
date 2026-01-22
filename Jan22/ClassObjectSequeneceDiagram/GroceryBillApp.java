package Jan22.ClassObjectSequeneceDiagram;
import java.util.*;

public class GroceryBillApp {
    public static void main(String[] args) {
        // Create customer and purchased products
        CustomerGro alice = new CustomerGro("Alice");

        alice.addProduct(new ProductGro("Apples", 2, 3.0)); // 2 kg @ 3
        alice.addProduct(new ProductGro("Milk", 1, 2.0));   // 1 liter @ 2

        BillGenerator billGen = new BillGenerator();
        double total = billGen.generateBill(alice);

        System.out.println("Customer: " + alice.getName());
        System.out.println("Purchased items:");
        for (ProductGro p : alice.getProducts()) {
            System.out.println(" - " + p.getName()
                    + " | qty: " + p.getQuantity()
                    + " | unit price: " + p.getUnitPrice());
        }
        System.out.println("Total Bill: " + total);
    }
}

// Composition in the context of a purchase: a customer's purchase "owns" these product entries
class CustomerGro {
    private String name;
    private List<ProductGro> products = new ArrayList<>();

    public CustomerGro(String name) {
        this.name = name;
    }

    public void addProduct(ProductGro product) {
        products.add(product);
    }

    public String getName() {
        return name;
    }

    public List<ProductGro> getProducts() {
        return products;
    }
}

class ProductGro {
    private String name;
    private double quantity;   // kg or liters
    private double unitPrice;  // price per kg or liter

    public ProductGro(String name, double quantity, double unitPrice) {
        this.name = name;
        this.quantity = quantity;
        this.unitPrice = unitPrice;
    }

    public String getName() {
        return name;
    }

    public double getQuantity() {
        return quantity;
    }

    public double getUnitPrice() {
        return unitPrice;
    }

    public double getLineTotal() {
        return quantity * unitPrice;
    }
}

class BillGenerator {

    public double generateBill(CustomerGro customer) {
        double total = 0;
        for (ProductGro p : customer.getProducts()) {
            total += p.getLineTotal();
        }
        return total;
    }
}