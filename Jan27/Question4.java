package Jan27;

import java.util.Scanner;

class Item {
    String name; int id, quantity; double price; Item next;
    Item(int id, String name, int quantity, double price) {
        this.id = id; this.name = name; this.quantity = quantity; this.price = price;
    }
}

public class Question4 {
    static Item head;

    static void addLast(int id, String name, int qty, double price) {
        Item node = new Item(id, name, qty, price);
        if (head == null) { head = node; return; }
        Item temp = head; while (temp.next != null) temp = temp.next; temp.next = node;
    }

    static void remove(int id) {
        if (head == null) return;
        if (head.id == id) { head = head.next; return; }
        Item temp = head; while (temp.next != null && temp.next.id != id) temp = temp.next;
        if (temp.next != null) temp.next = temp.next.next;
    }

    static Item search(int id) {
        Item temp = head; while (temp != null) { if (temp.id == id) return temp; temp = temp.next; } return null;
    }

    static void searchName(String name) {
        Item temp = head; while (temp != null) {
            if (temp.name.toLowerCase().contains(name.toLowerCase())) {
                System.out.println(temp.id + ": " + temp.name + " (Qty:" + temp.quantity + ")");
            } temp = temp.next;
        }
    }

    static void updateQty(int id, int qty) {
        Item item = search(id); if (item != null) item.quantity = qty;
    }

    static double totalValue() {
        double total = 0; Item temp = head;
        while (temp != null) { total += temp.price * temp.quantity; temp = temp.next; } return total;
    }

    static void bubbleSortName() {
        if (head == null) return;
        boolean swapped; Item ptr1; Item lptr = null;
        do { swapped = false; ptr1 = head;
            while (ptr1.next != lptr) {
                if (ptr1.name.compareTo(ptr1.next.name) > 0) {
                    // Swap data
                    String tname = ptr1.name; ptr1.name = ptr1.next.name; ptr1.next.name = tname;
                    int tid = ptr1.id; ptr1.id = ptr1.next.id; ptr1.next.id = tid;
                    int tqty = ptr1.quantity; ptr1.quantity = ptr1.next.quantity; ptr1.next.quantity = tqty;
                    double tprice = ptr1.price; ptr1.price = ptr1.next.price; ptr1.next.price = tprice;
                    swapped = true;
                } ptr1 = ptr1.next;
            } lptr = ptr1;
        } while (swapped);
    }

    static void display() {
        System.out.println("\nID\tName\tQty\tPrice\tValue");
        Item temp = head; while (temp != null) {
            System.out.println(temp.id + "\t" + temp.name + "\t" + temp.quantity + "\t" +
                    String.format("%.2f", temp.price) + "\t" + String.format("%.2f", temp.price*temp.quantity));
            temp = temp.next;
        }
        System.out.println("Total Value: " + String.format("%.2f", totalValue()));
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); int choice;
        do {
            System.out.println("\n1.Add 2.Remove 3.SearchID 4.SearchName 5.UpdateQty 6.SortName 7.Display 0.Exit");
            choice = sc.nextInt(); sc.nextLine();
            switch(choice) {
                case 1: System.out.print("ID:"); int id=sc.nextInt();sc.nextLine();
                    System.out.print("Name:"); String n=sc.nextLine();
                    System.out.print("Qty:"); int q=sc.nextInt();
                    System.out.print("Price:"); double p=sc.nextDouble(); sc.nextLine();
                    addLast(id,n,q,p); break;
                case 2: System.out.print("ID:"); remove(sc.nextInt()); break;
                case 3: System.out.print("ID:"); Item it=search(sc.nextInt());
                    if(it!=null) System.out.println("Found: "+it.name); break;
                case 4: System.out.print("Name:"); searchName(sc.nextLine()); break;
                case 5: System.out.print("ID:"); int uid=sc.nextInt();sc.nextLine();
                    System.out.print("NewQty:"); updateQty(uid,sc.nextInt()); break;
                case 6: bubbleSortName(); System.out.println("Sorted by Name!"); break;
                case 7: display(); break;
            }
        } while(choice!=0); sc.close();
    }
}