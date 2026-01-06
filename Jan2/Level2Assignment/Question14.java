package Jan2.Level2Assignment;
import java.util.Scanner;

public class Question14 {
    public static void main(String[] args) {
        /*
        Q14: Rewrite the above program to find the power of a number using a while loop.
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
            int counter = 0;
            while(counter < exponent) {
                result = result * base;
                counter++;
            }
            System.out.println("Result: " + result);
        }

        scn.close();
    }
}
