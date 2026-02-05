package Feb4;

interface Category {
    String getType();
}

class BookCategory implements Category {
    @Override
    public String getType() {
        return "Book";
    }
}

class ClothingCategory implements Category {
    @Override
    public String getType() {
        return "Clothing";
    }
}

class Product<T extends Category> {
    private String name;
    private T category;
    private double price;

    public Product(String name, T category, double price) {
        this.name = name;
        this.category = category;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public T getCategory() {
        return category;
    }

    public double getPrice() {
        return price;
    }

    public void applyDiscount(double percentage) {
        price = price * (1 - percentage / 100.0);
    }
}

public class Question2 {

    public static <T extends Product<?>> void applyDiscount(T product, double percentage) {
        product.applyDiscount(percentage);
    }

    public static void main(String[] args) {
        Product<BookCategory> book =
                new Product<>("Java Basics", new BookCategory(), 500.0);
        Product<ClothingCategory> shirt =
                new Product<>("T-Shirt", new ClothingCategory(), 800.0);

        applyDiscount(book, 10);
        applyDiscount(shirt, 20);

        System.out.println(book.getName() + " (" + book.getCategory().getType() +
                ") price: " + book.getPrice());
        System.out.println(shirt.getName() + " (" + shirt.getCategory().getType() +
                ") price: " + shirt.getPrice());
    }
}