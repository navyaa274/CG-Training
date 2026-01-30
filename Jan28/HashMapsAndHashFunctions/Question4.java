package Jan28.HashMapsAndHashFunctions;
import java.util.*;

public class Question4 {
    public static void main(String[] args) {
        System.out.println("=== Custom Hash Map ===");
        CustomHashMap map = new CustomHashMap(10);

        map.put(1, "One");
        map.put(2, "Two");
        map.put(12, "Twelve"); // collision with key 2
        map.put(3, "Three");

        System.out.println("get(1): " + map.get(1)); // One
        System.out.println("get(12): " + map.get(12)); // Twelve
        System.out.println("remove(2): " + map.remove(2));
        System.out.println("get(2): " + map.get(2)); // null

        System.out.println("Size: " + map.size());
    }
}

class CustomHashMap {
    private static class Entry {
        Object key;
        Object value;
        Entry next;

        Entry(Object key, Object value) {
            this.key = key;
            this.value = value;
        }
    }

    private Entry[] table;
    private int size;

    public CustomHashMap(int capacity) {
        table = new Entry[capacity];
        size = 0;
    }

    private int hash(Object key) {
        return Math.abs(key.hashCode() % table.length);
    }

    public void put(Object key, Object value) {
        int index = hash(key);
        Entry entry = table[index];

        while (entry != null) {
            if (key.equals(entry.key)) {
                entry.value = value;
                return;
            }
            entry = entry.next;
        }

        Entry newEntry = new Entry(key, value);
        newEntry.next = table[index];
        table[index] = newEntry;
        size++;
    }

    public Object get(Object key) {
        int index = hash(key);
        Entry entry = table[index];

        while (entry != null) {
            if (key.equals(entry.key)) {
                return entry.value;
            }
            entry = entry.next;
        }
        return null;
    }

    public Object remove(Object key) {
        int index = hash(key);
        Entry entry = table[index];
        Entry prev = null;

        while (entry != null) {
            if (key.equals(entry.key)) {
                if (prev == null) {
                    table[index] = entry.next;
                } else {
                    prev.next = entry.next;
                }
                size--;
                return entry.value;
            }
            prev = entry;
            entry = entry.next;
        }
        return null;
    }

    public int size() {
        return size;
    }
}