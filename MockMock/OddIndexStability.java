package MockMock;
import java.util.*;

public class OddIndexStability {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scn.nextInt();
        }

        evenIndSwap(arr, n);
    }

    public static void evenIndSwap(int[] arr, int n) {
        int l = n/2;
        int[] even =  new int[l];
        even[0] = arr[0];
        int j = 0;
        for (int i = 2; i < n; i+=2) {
            j++;
            even[j] = arr[i];
        }
        int temp = even[j];
        for(int k=l-1;k>0;k--){
            even[k] = even[k-1];
        }
        even[0] = temp;
        arr[0] = even[0];
        int m = 0;
        for (int i = 2; i < n; i+=2) {
                m++;
                arr[i] = even[m];
        }
        System.out.println(Arrays.toString(arr));
    }
}
