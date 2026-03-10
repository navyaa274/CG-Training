package M1TestPractice;

import java.util.Scanner;

public class MissingInArray {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[]  arr = new int[n];

        for(int i=0;i<n;i++){
            arr[i] = scn.nextInt();
        }

        int ans = missingNum(arr);
        System.out.println(ans);
    }

    public static int missingNum(int[] arr){
        int sum = 0;
        int diff = 0;
        int curr = 1;
        for(int a : arr){
            diff = curr-a;
            sum += diff;
            curr++;
        }
        return sum+curr;
    }

}
