package Jan29;
import java.util.*;

public class Question6 {
    public static void main(String[] args) {
        System.out.println("=== Data Structures Search ===");
        int[] sizes = {1000, 100000, 1000000};
        Random rand = new Random(42);
        int target = 42;

        for (int n : sizes) {
            // Array O(N)
            int[] array = new int[n];
            for (int i = 0; i < n; i++) array[i] = rand.nextInt(100);
            long start = System.nanoTime();
            arraySearch(array, target);
            long arrayTime = (System.nanoTime() - start) / 1_000_000;

            // HashSet O(1)
            Set<Integer> hashSet = new HashSet<>();
            for (int i = 0; i < n; i++) hashSet.add(rand.nextInt(100));
            start = System.nanoTime();
            hashSet.contains(target);
            long hashTime = (System.nanoTime() - start) / 1_000_000;

            // TreeSet O(log N)
            SortedSet<Integer> treeSet = new TreeSet<>();
            for (int i = 0; i < n; i++) treeSet.add(rand.nextInt(100));
            start = System.nanoTime();
            treeSet.contains(target);
            long treeTime = (System.nanoTime() - start) / 1_000_000;

            System.out.printf("N=%d: Array=%.2fms, HashSet=%.2fms, TreeSet=%.2fms%n", n, (double)arrayTime, (double)hashTime, (double)treeTime);
        }
    }

    static int arraySearch(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) return i;
        }
        return -1;
    }
}