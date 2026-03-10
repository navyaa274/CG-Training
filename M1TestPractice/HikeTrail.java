package M1TestPractice;

import java.util.Scanner;

public class HikeTrail {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scn.nextInt();
        }

        int ans = peak(arr, n);
        System.out.println(ans);
    }

    public static int peak(int[] arr, int n) {
        int ans = 0;
        for (int i = 1; i < n-1; i++) {
            if (arr[i-1] < arr[i] && arr[i] > arr[i+1]) {
                ans = arr[i];
            }
        }
        return ans;
    }
}
