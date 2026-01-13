package Jan9_CG_Codes;
import java.util.Scanner;

/*
Q15: Find duplicate elements in an array
*/

public class DuplicateElements {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr = new int[n];
        boolean[] visited = new boolean[n];

        for(int i = 0; i < n; i++) {
            arr[i] = scn.nextInt();
        }

        System.out.println("Duplicate elements:");
        for(int i = 0; i < n; i++) {
            if(visited[i]) continue;
            boolean dup = false;
            for(int j = i + 1; j < n; j++) {
                if(arr[i] == arr[j]) {
                    dup = true;
                    visited[j] = true;
                }
            }
            if(dup) {
                System.out.print(arr[i] + " ");
            }
        }
        scn.close();
    }
}