package Jan9_CG_Codes;
import java.util.Scanner;

/*
Q5: Find the second largest element in an array.
*/

public class SecondLargestElement {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        
        int n = scn.nextInt();
        int[] arr = new int[n];

        for(int i = 0; i<n; i++){
            arr[i] = scn.nextInt();
        }

        int max1 = Integer.MIN_VALUE;
        int max2 = Integer.MIN_VALUE;

        for(int i = 0; i<n; i++){
            if(arr[i] > max1){
                max2 = max1;
                max1 = arr[i];
            }
            else if(arr[i] > max2 && arr[i] != max1){
                max2 = arr[i];
            }
        }

        if(max2 == Integer.MIN_VALUE){
            System.out.println("No second largest element");
        }
        else{
            System.out.println("Second largest element: " + max2);
        }

        scn.close();
    }
}