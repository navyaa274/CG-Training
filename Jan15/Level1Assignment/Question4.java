package Jan15.Level1Assignment;

/*
Q4: Create an Item class with attributes itemCode, itemName, and price. Add a method
to display item details and calculate the total cost for a given quantity.
 */

class Item {
    String itemCode, itemName;
    double price;

    void display(int quantity) {
        double total = price * quantity;
        System.out.printf("Item: %s (%s), Price: ₹%.2f, Qty: %d, Total: ₹%.2f%n",
                itemName, itemCode, price, quantity, total);
    }
}

public class Question4 {
    public static void main(String[] args) {
        Item laptop = new Item();
        laptop.itemCode = "IT001";
        laptop.itemName = "Laptop";
        laptop.price = 45000;
        laptop.display(2);

        Item mouse = new Item();
        mouse.itemCode = "IT002";
        mouse.itemName = "Mouse";
        mouse.price = 500;
        mouse.display(5);
    }
}
