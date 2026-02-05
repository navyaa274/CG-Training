package Feb4;
import java.util.*;

abstract class WarehouseItem {
    protected String name;

    public WarehouseItem(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public abstract double getValue();
}

class Electronics extends WarehouseItem {
    public Electronics(String name) {
        super(name);
    }

    @Override
    public double getValue() {
        return 1000.0;
    }
}

class Grocery extends WarehouseItem {
    public Grocery(String name) {
        super(name);
    }

    @Override
    public double getValue() {
        return 5.0;
    }
}

class Furniture extends WarehouseItem {
    public Furniture(String name) {
        super(name);
    }

    @Override
    public double getValue() {
        return 500.0;
    }
}

class Storage<T extends WarehouseItem> {
    private List<T> items = new ArrayList<>();

    public void addItem(T item) {
        items.add(item);
    }

    public List<T> getItems() {
        return items;
    }
}

public class Question1 {
    public static void displayAllItems(List<? extends WarehouseItem> items) {
        for (WarehouseItem item : items) {
            System.out.println(item.getName() + " -> " + item.getValue());
        }
    }

    public static void main(String[] args) {
        Storage<Electronics> electronicsStorage = new Storage<>();
        electronicsStorage.addItem(new Electronics("Laptop"));
        electronicsStorage.addItem(new Electronics("Phone"));

        Storage<Grocery> groceryStorage = new Storage<>();
        groceryStorage.addItem(new Grocery("Apple"));
        groceryStorage.addItem(new Grocery("Milk"));

        List<WarehouseItem> all = new ArrayList<>();
        all.addAll(electronicsStorage.getItems());
        all.addAll(groceryStorage.getItems());

        displayAllItems(all);
    }
}