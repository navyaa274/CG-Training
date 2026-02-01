package Feb1;
import java.util.*;

public class ListNthFromEnd {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>(Arrays.asList("A", "B", "C", "D", "E"));
        System.out.println("List: " + list);
        String result = getNthFromEnd(list, 2);
        System.out.println("2nd from end: " + result); // D
    }

    public static <T> T getNthFromEnd(LinkedList<T> list, int n) {
        LinkedList<T> first = new LinkedList<>(list);
        LinkedList<T> second = new LinkedList<>(list);

        for (int i = 0; i < n; i++) {
            first.removeLast();
        }

        while (!first.isEmpty()) {
            first.removeLast();
            second.removeLast();
        }
        return second.isEmpty() ? null : second.getLast();
    }
}