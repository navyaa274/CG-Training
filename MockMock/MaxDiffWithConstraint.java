package MockMock;
import java.util.*;

public class MaxDiffWithConstraint {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scn.nextInt();
        }

        int res = maxDiff(arr, n);
        System.out.println(res);
    }

    public static int maxDiff(int[] arr, int n) {
        int maxD = 0;
        for (int j = n-1; j > 0; j--) {
            for(int i = j-1; i >= 0; i--) {
                if(arr[j]-arr[i] > maxD) {
                    maxD = arr[j]-arr[i];
                }
            }
        }
        return maxD;
    }
}
