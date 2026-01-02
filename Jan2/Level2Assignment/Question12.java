package Jan2.Level2Assignment;
import java.util.Scanner;

public class Question12 {
    public static void main(String[] args) {
        /*
        Q12: Create a program to find the power of a number.
        */

        int base, exponent;

        Scanner scn = new Scanner(System.in);

        base = scn.nextInt();
        exponent = scn.nextInt();

        if(base < 0 || exponent < 0) {
            System.out.println("Please enter positive integers only.");
        }
        else{
            int result = 1;
            for (int i = 1; i <= exponent; ++i) {
                result = result * base;
            }
            System.out.println("Result: " + result);
        }
        
        scn.close();
    }
}
