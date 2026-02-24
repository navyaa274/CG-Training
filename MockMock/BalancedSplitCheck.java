package MockMock;
import java.util.*;

public class BalancedSplitCheck {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scn.nextInt();
        }
        boolean res = splitCheck(arr, n);
        System.out.println(res);
    }

    public static boolean splitCheck(int[] arr, int n) {
        int s = 1;

        while (s < n) {
            int sumL = 0;
            int sumR = 0;
            for (int i = 0; i < s; i++) {
                sumL += arr[i];
            }
            for (int j = s; j < n; j++) {
                sumR += arr[j];
            }
            if (sumL == sumR) {
                return true;
            }
            s = s+1;
        }
        return false;
    }
}
