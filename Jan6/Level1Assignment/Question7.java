package Jan6.Level1Assignment;
import java.util.Scanner;

public class Question7 {
    public static void main(String[] args) {
        /*
        Q7: Create a program to save odd and even numbers into odd and even arrays between 1 to the
        number entered by the user. Finally, print the odd and even numbers array
        */

        int n;
        Scanner scn = new Scanner(System.in);

        n = scn.nextInt();

        if(n <= 0){
            System.out.println("Not a natural number");
            scn.close();
            return;
        }

        int[] even = new int[n/2+1];
        int[] odd = new int[n/2+1];
        int e = 0;
        int o = 0;

        for(int i = 1; i<=n; i++){
            if(i%2 ==0){
                even[e] = i;
                e++;
            }
            else{
                odd[o] = i;
                o++;
            }
        }

        System.out.println("Even numbers:");
        for(int i=0; i<e; i++){
            System.out.print(even[i] + " ");
        }
        System.out.println();
        System.out.println("Odd numbers:");
        for(int i=0; i<o; i++){
            System.out.print(odd[i] + " ");
        }

        scn.close();
    }
}