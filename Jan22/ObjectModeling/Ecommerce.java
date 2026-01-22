package Jan22.ObjectModeling;
import java.util.*;

public class Ecommerce {
    public static void main(String[] args) {
        CustomerEC cust = new CustomerEC("Karan");

        Product p1 = new Product("Laptop", 50000);
        Product p2 = new Product("Mouse", 500);

        Order order1 = new Order(1);
        order1.addProduct(p1);
        order1.addProduct(p2);

        cust.placeOrder(order1);

        System.out.println("Order total: " + order1.total());
    }
}

class Product {
    String name;
    double price;

    Product(String name, double price) {
        this.name = name;
        this.price = price;
    }
}

class Order {
    int id;
    List<Product> products = new ArrayList<>();

    Order(int id) {
        this.id = id;
    }

    void addProduct(Product p) {
        products.add(p);
    }

    double total() {
        double sum = 0;
        for (Product p : products) {
            sum += p.price;
        }
        return sum;
    }
}

class CustomerEC {
    String name;
    List<Order> orders = new ArrayList<>();

    CustomerEC(String name) {
        this.name = name;
    }

    void placeOrder(Order o) {
        orders.add(o);
        System.out.println(name + " placed order " + o.id);
    }
}