package Jan9_CG_Codes;
import java.util.Scanner;

/*
Q22: Find missing number in an array.
 */

public class MissingNumber {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = scn.nextInt();
        }

        int[] missing = new int[n];

        for(int i = 0; i < n; i++) {
            missing[arr[i]]++;
        }

        for (int i = 0; i < n; i++) {
            if(missing[i] == 0) {
                System.out.println("Missing number: " + i);
                scn.close();
                return;
            }
        }

        System.out.println("Missing number: " + n);
        scn.close();
    }
}