package MockMock;
import java.util.*;

public class StabilityInSwapping {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scn.nextInt();
        }

        stableSwap(arr, n);
    }

    public static void stableSwap(int[] arr, int n) {
        int l;
        if (n%2==0){
            l = n-1;
        }
        else{
            l = n-2;
        }
        for (int i = 0; i < l; i+=2) {
            if (arr[i] > arr[i+1]) {
                int temp = arr[i];
                arr[i] = arr[i+1];
                arr[i+1] = temp;
            }
        }

        System.out.println(Arrays.toString(arr));
    }
}

