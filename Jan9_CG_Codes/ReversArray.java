package Jan9_CG_Codes;
import java.util.Scanner;

/*
Q14: Reverse an array using 2-pointer
*/

public class ReversArray {
    public static void main(String[] args) {
        Scanner  scn = new Scanner(System.in);

        int n = scn.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = scn.nextInt();
        }

        int a = 0;
        int b = n-1;

        while(a < b){
            int temp = arr[a];
            arr[a] = arr[b];
            arr[b] = temp;
            a++;
            b--;
        }

        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }

        scn.close();
    }
}
