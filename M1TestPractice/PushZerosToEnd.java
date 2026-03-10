package M1TestPractice;

import java.util.Arrays;
import java.util.Scanner;

public class PushZerosToEnd {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[]  arr = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = scn.nextInt();
        }

        pushZeros(arr, n);
    }

    public static void pushZeros(int[] arr, int n){
        int i = 0;
        int j = 0;
        while (i < n){
            if (arr[i] == 0) i++;
            else {
                arr[j] = arr[i];
                i++;
                j++;
            }
        }
        while (j < n){
            arr[j] = 0;
            j++;
        }

        System.out.println(Arrays.toString(arr));
    }
}
