package Jan30;
import java.util.*;

public class Question13 {

    //Find the Peak Element in an Array
    public static int peakElement(int[] arr) {
        int n = arr.length;
        if (n == 0) return -1;
        if (n == 1) return 0;

        int left = 0;
        int right = n - 1;

        while (left < right) {
            int mid = left + (right - left) / 2;

            if (arr[mid] < arr[mid + 1]) {
                left = mid + 1;
            } else {
                right = mid;
            }
        }
        return left; // peak index
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int peakIndex = peakElement(arr);
        System.out.println("Peak element index: " + peakIndex);
        sc.close();
    }
}