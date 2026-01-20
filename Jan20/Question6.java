package Jan20;

public class Question6 {
    public static void main(String[] args) {
        System.out.println("=== Food Delivery System ===");
        FoodItem[] items = {
                new VegItem("Veg Curry", 10, 2),
                new NonVegItem("Chicken", 20, 1)
        };
        for (FoodItem f : items) {
            f.getItemDetails();
            System.out.println("After discount: $" + ((Discountable) f).applyDiscount(f.calculateTotalPrice()));
        }
        System.out.println();
    }
}

abstract class FoodItem {
    private String itemName;
    private double price;
    private int quantity;

    public FoodItem(String itemName, double price, int quantity) {
        this.itemName = itemName;
        this.price = price;
        this.quantity = quantity;
    }

    public abstract double calculateTotalPrice();

    public void getItemDetails() {
        System.out.println(itemName + " total: $" + calculateTotalPrice());
    }

    protected double getPrice() { return price; }
    protected int getQuantity() { return quantity; }
}

interface Discountable {
    default double applyDiscount(double total) { return total * 0.9; }
}

class VegItem extends FoodItem implements Discountable {
    public VegItem(String name, double price, int qty) { super(name, price, qty); }
    public double calculateTotalPrice() { return getPrice() * getQuantity(); }
}

class NonVegItem extends FoodItem implements Discountable {
    public NonVegItem(String name, double price, int qty) { super(name, price, qty); }
    public double calculateTotalPrice() { return getPrice() * getQuantity() * 1.2; }
}