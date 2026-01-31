package Jan30;
import java.util.*;

public class Question12 {

    //Find the Rotation Point in a Rotated Sorted Array
    public static int rotationPoint(int[] arr) {
        int left = 0;
        int right = arr.length - 1;

        while (left < right) {
            int mid = left + (right - left) / 2;

            if (arr[mid] > arr[right]) {
                left = mid + 1;
            } else {
                right = mid;
            }
        }
        return left; // index of smallest element
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of rotated sorted array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int index = rotationPoint(arr);
        System.out.println("Rotation point index: " + index);
        sc.close();
    }
}