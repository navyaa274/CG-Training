package Jan30;
import java.util.*;

public class Question16 {

    /*
    Write a program that uses Linear Search to find the first
    missing positive integer in the list and Binary Search to
    find the index of a given target number.
    */
    public static int[] linearAndBinary(int[] nums, int target) {
        int firstMissingPositive = firstMissingPositiveUsingExtraArray(nums);
        Arrays.sort(nums);
        int targetIndex = binarySearch(nums, target);
        return new int[]{firstMissingPositive, targetIndex};
    }

    private static int firstMissingPositiveUsingExtraArray(int[] nums) {
        int n = nums.length;
        boolean[] present = new boolean[n + 2];

        for (int num : nums) {
            if (num >= 1 && num <= n) {
                present[num] = true;
            }
        }

        for (int i = 1; i <= n + 1; i++) {
            if (!present[i]) {
                return i;
            }
        }
        return 1;
    }

    private static int binarySearch(int[] arr, int target) {
        int left = 0, right = arr.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (arr[mid] == target) {
                return mid;
            } else if (arr[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of array: ");
        int n = sc.nextInt();
        int[] nums = new int[n];
        System.out.println("Enter elements:");
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }
        System.out.print("Enter target for binary search: ");
        int target = sc.nextInt();

        int[] result = linearAndBinary(nums, target);
        System.out.println("First missing positive: " + result[0]);
        System.out.println("Target index after sorting: " + result[1]);
        sc.close();
    }
}