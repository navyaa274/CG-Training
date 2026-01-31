package Jan29;
import java.util.*;

public class Question2 {
    public static void main(String[] args) {
        System.out.println("=== Sorting Large Data ===");
        int[] sizes = {1000, 10000};
        Random rand = new Random(42);

        for (int n : sizes) {
            int[] data = new int[n];
            for (int i = 0; i < n; i++) data[i] = rand.nextInt(10000);
            int[] bubbleData = data.clone(), mergeData = data.clone(), quickData = data.clone();

            // Bubble O(N²)
            long start = System.nanoTime();
            bubbleSort(bubbleData);
            long bubbleTime = (System.nanoTime() - start) / 1_000_000;

            // Merge O(N log N)
            start = System.nanoTime();
            mergeSort(mergeData, 0, mergeData.length - 1);
            long mergeTime = (System.nanoTime() - start) / 1_000_000;

            // Quick (Arrays.sort is optimized quicksort)
            start = System.nanoTime();
            quickSort(quickData, 0, quickData.length - 1);
            long quickTime = (System.nanoTime() - start) / 1_000_000;

            System.out.printf("N=%d: Bubble=%.0fms, Merge=%.0fms, Quick=%.0fms%n", n, (double)bubbleTime, (double)mergeTime, (double)quickTime);
        }
    }

    static void bubbleSort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++)
            for (int j = 0; j < arr.length - i - 1; j++)
                if (arr[j] > arr[j + 1]) swap(arr, j, j + 1);
    }

    static void mergeSort(int[] arr, int l, int r) {
        if (l < r) {
            int m = l + (r - l) / 2;
            mergeSort(arr, l, m);
            mergeSort(arr, m + 1, r);
            merge(arr, l, m, r);
        }
    }

    static void merge(int[] arr, int l, int m, int r) {
        int n1 = m - l + 1, n2 = r - m;
        int[] L = new int[n1], R = new int[n2];
        System.arraycopy(arr, l, L, 0, n1);
        System.arraycopy(arr, m + 1, R, 0, n2);
        int i = 0, j = 0, k = l;
        while (i < n1 && j < n2) {
            arr[k++] = L[i] <= R[j] ? L[i++] : R[j++];
        }
        while (i < n1) arr[k++] = L[i++];
        while (j < n2) arr[k++] = R[j++];
    }

    static void quickSort(int[] arr, int low, int high) {
        if (low < high) {
            int pi = partition(arr, low, high);
            quickSort(arr, low, pi - 1);
            quickSort(arr, pi + 1, high);
        }
    }

    static int partition(int[] arr, int low, int high) {
        int pivot = arr[high];
        int i = low - 1;
        for (int j = low; j < high; j++)
            if (arr[j] <= pivot) swap(arr, ++i, j);
        swap(arr, i + 1, high);
        return i + 1;
    }

    static void swap(int[] arr, int i, int j) {
        int temp = arr[i]; arr[i] = arr[j]; arr[j] = temp;
    }
}