package Jan2.Level2Assignment;
import java.util.Scanner;

public class Question9 {
    public static void main(String[] args) {
        /*
        Q9: Create a program to print the greatest factor of a number beside itself using a for loop.
        */

        int num;

        Scanner scn = new Scanner(System.in);
        
        num = scn.nextInt();
        
        System.out.println("Greatest factor of " + num + " besides itself is: ");
        for (int i = num / 2; i >= 1; --i) {
            // if i is a factor of num
            if (num % i == 0) {
                System.out.print(i + " ");
                break;
            }
        }
        scn.close();
    }
}
