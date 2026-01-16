package Jan15.Level2Assignment;

/*
Q5: Create a CartItem class with attributes itemName, price, and quantity. Add methods to:
Add an item to the cart.
Remove an item from the cart.
Display the total cost.
 */

class CartItem {
    String itemName;
    double price;
    int quantity;

    void addItem(int qty) {
        quantity += qty;
        System.out.println("Added " + qty + " " + itemName + "(s)");
    }

    void removeItem(int qty) {
        if (qty <= quantity) {
            quantity -= qty;
            System.out.println("Removed " + qty + " " + itemName + "(s)");
        } else {
            System.out.println("Cannot remove " + qty + " - only " + quantity + " available");
        }
    }

    double getTotal() {
        return price * quantity;
    }

    void displayTotal() {
        System.out.printf("%s: %d x ₹%.2f = ₹%.2f%n", itemName, quantity, price, getTotal());
    }
}

public class Question5 {
    public static void main(String[] args) {
        CartItem mouse = new CartItem();
        mouse.itemName = "Wireless Mouse";
        mouse.price = 500;
        mouse.addItem(3);
        mouse.displayTotal();

        CartItem keyboard = new CartItem();
        keyboard.itemName = "Mechanical Keyboard";
        keyboard.price = 2500;
        keyboard.addItem(2);
        keyboard.removeItem(1);
        keyboard.displayTotal();
    }
}