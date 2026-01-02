package Jan2.Level2Assignment;
import java.util.Scanner;

public class Question10 {
    public static void main(String[] args) {
        /*
        Q10: Create a program to print the greatest factor of a number beside itself using a while loop.
        */

        int num;

        Scanner scn = new Scanner(System.in);

        num = scn.nextInt();

        System.out.println("Greatest factor of " + num + " besides itself is: ");
        int i = num / 2;
        while (i >= 1) {
            // if i is a factor of num
            if (num % i == 0) {
                System.out.print(i + " ");
                break;
            }
            i--;
        }
        
        scn.close();
    }
}
