package Feb1;
import java.util.*;

public class ListReverse {
    public static void main(String[] args) {
        // ArrayList reverse
        ArrayList<Integer> arrList = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
        System.out.println("Original ArrayList: " + arrList);
        reverseArrayList(arrList);
        System.out.println("Reversed ArrayList: " + arrList);

        System.out.println();

        // LinkedList reverse
        LinkedList<Integer> linkedList = new LinkedList<>(Arrays.asList(1, 2, 3, 4, 5));
        System.out.println("Original LinkedList: " + linkedList);
        reverseLinkedList(linkedList);
        System.out.println("Reversed LinkedList: " + linkedList);
    }

    public static void reverseArrayList(ArrayList<Integer> list) {
        int left = 0, right = list.size() - 1;
        while (left < right) {
            int temp = list.get(left);
            list.set(left, list.get(right));
            list.set(right, temp);
            left++;
            right--;
        }
    }

    public static void reverseLinkedList(LinkedList<Integer> list) {
        LinkedList<Integer> reversed = new LinkedList<>();
        while (!list.isEmpty()) {
            reversed.addFirst(list.removeLast());
        }
        list.addAll(reversed);
    }
}