package Jan19;

public class Question4 {
    public static void main(String[] args) {
        Author javaBook = new Author(
                "Java Programming", 2024,
                "John Doe", "Expert Java author with 20+ years experience"
        );
        javaBook.displayInfo();
    }
}

class Book {
    protected String title; protected int publicationYear;
    public Book(String title, int year) {
        this.title = title; this.publicationYear = year;
    }
    public void displayInfo() {
        System.out.println("Book: '" + title + "' (" + publicationYear + ")");
    }
}

class Author extends Book {
    private String authorName, bio;
    public Author(String title, int year, String name, String bio) {
        super(title, year); this.authorName = name; this.bio = bio;
    }
    @Override public void displayInfo() {
        super.displayInfo();
        System.out.println("Author: " + authorName + " | Bio: " + bio);
    }
}