package Jan22.ObjectModeling;
import java.util.*;

public class LibraryBook {
    public static void main(String[] args) {
        Book b1 = new Book("1984", "Orwell");
        Book b2 = new Book("To Kill a Mockingbird", "Lee");
        Library lib1 = new Library("Public Lib");
        lib1.addBook(b1);
        lib1.showBooks();
        Library lib2 = new Library("Uni Lib");
        lib2.addBook(b2);
        lib2.addBook(b1);  // Same book in multiple libs - aggregation demo
        lib2.showBooks();
    }
}

class Book {
    String title;
    String author;
    Book(String title, String author) {
        this.title = title;
        this.author = author;
    }
    public String getDetails() {
        return title + " by " + author;
    }
}

class Library {
    String name;
    List<Book> books = new ArrayList<>();
    Library(String name) {
        this.name = name;
    }
    void addBook(Book b) {
        books.add(b);  // Reference only - books independent
    }
    void showBooks() {
        System.out.println(name + " books:");
        for (Book b : books) {
            System.out.println(b.getDetails());
        }
    }
}