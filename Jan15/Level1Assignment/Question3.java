package Jan15.Level1Assignment;

/*
Q3: Write a program to create a Book class with attributes title, author, and price.
Add a method to display the book details.
 */

class Book {
    String title, author;
    double price;

    void display() {
        System.out.println("Title: " + title + ", Author: " + author + ", Price: ₹" + price);
    }
}

public class Question3 {
    public static void main(String[] args) {
        Book b1 = new Book();
        b1.title = "Java Basics";
        b1.author = "John Doe";
        b1.price = 299.99;
        b1.display();

        Book b2 = new Book();
        b2.title = "Data Structures";
        b2.author = "Jane Smith";
        b2.price = 499.99;
        b2.display();
    }
}
