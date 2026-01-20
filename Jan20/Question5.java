package Jan20;

public class Question5 {
    public static void main(String[] args) {
        System.out.println("=== Library Management ===");
        LibraryItem[] items = {
                new Book(1, "Java Book", "Author1"),
                new Magazine(2, "Mag", "Author2"),
                new DVD(3, "DVD", "Director")
        };
        for (LibraryItem i : items) {
            i.getItemDetails();
            ((Reservable) i).reserveItem();
        }
        System.out.println();
    }
}

abstract class LibraryItem {
    private int itemId;
    private String title;
    private String author;

    public LibraryItem(int itemId, String title, String author) {
        this.itemId = itemId;
        this.title = title;
        this.author = author;
    }

    public abstract int getLoanDuration();

    public void getItemDetails() {
        System.out.println("ID: " + itemId + ", Title: " + title + ", Duration: " + getLoanDuration() + " days");
    }

    public int getItemId() { return itemId; }
}

interface Reservable {
    default boolean reserveItem() { return true; }
}

class Book extends LibraryItem implements Reservable {
    public Book(int id, String title, String author) { super(id, title, author); }
    public int getLoanDuration() { return 14; }
}

class Magazine extends LibraryItem implements Reservable {
    public Magazine(int id, String title, String author) { super(id, title, author); }
    public int getLoanDuration() { return 7; }
}

class DVD extends LibraryItem implements Reservable {
    public DVD(int id, String title, String author) { super(id, title, author); }
    public int getLoanDuration() { return 3; }
}