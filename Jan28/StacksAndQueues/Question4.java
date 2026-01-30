package Jan28.StacksAndQueues;
import java.util.*;

public class Question4 {
    public static void main(String[] args) {
        System.out.println("=== Sliding Window Maximum ===");
        int[] arr = {1, 3, -1, -3, 5, 3, 6, 7};
        int k = 3;
        int[] result = Question4.findMaxSlidingWindow(arr, k);

        for (int max : result) {
            System.out.print(max + " "); // 3 3 5 5 6 7
        }
        System.out.println();
    }

    static int[] findMaxSlidingWindow(int[] arr, int k) {
        if (arr == null || k == 0) return new int[0];

        LinkedList<Integer> deque = new LinkedList<>();
        int[] result = new int[arr.length - k + 1];

        for (int i = 0; i < arr.length; i++) {
            if (!deque.isEmpty() && deque.getFirst() == i - k) {
                deque.removeFirst();
            }

            while (!deque.isEmpty() && arr[deque.getLast()] < arr[i]) {
                deque.removeLast();
            }

            deque.addLast(i);

            if (i >= k - 1) {
                result[i - k + 1] = arr[deque.getFirst()];
            }
        }
        return result;
    }
}