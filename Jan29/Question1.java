package Jan29;
import java.util.*;

public class Question1 {
    public static void main(String[] args) {
        System.out.println("=== Search Target in Large Dataset ===");
        int[] sizes = {1000, 10000, 1000000};
        int target = 500;

        for (int n : sizes) {
            int[] data = new int[n];
            for (int i = 0; i < n; i++) data[i] = i;

            // Linear Search O(N)
            long start = System.nanoTime();
            linearSearch(data, target);
            long linearTime = (System.nanoTime() - start) / 1_000_000;

            // Binary Search O(log N) - assumes sorted
            Arrays.sort(data); // O(N log N) once
            start = System.nanoTime();
            binarySearch(data, target);
            long binaryTime = (System.nanoTime() - start) / 1_000_000;

            System.out.printf("N=%d: Linear=%.2fms, Binary=%.2fms%n", n, (double)linearTime, (double)binaryTime);
        }
    }

    static int linearSearch(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) return i;
        }
        return -1;
    }

    static int binarySearch(int[] arr, int target) {
        int left = 0, right = arr.length - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (arr[mid] == target) return mid;
            else if (arr[mid] < target) left = mid + 1;
            else right = mid - 1;
        }
        return -1;
    }
}