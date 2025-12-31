package Dec31.Level2Assignment;
import java.util.*;

public class Question1 {
    public static void main(String[] args) {
        
        /*
        Q1: Write a program to take 2 numbers and print their quotient and reminder
        */

        int num1, num2;

        Scanner scn = new Scanner(System.in);

        num1 = scn.nextInt();
        num2 = scn.nextInt();

        int quotient = num1 / num2;
        int remainder = num1 % num2;

        System.out.println("The Quotient is " + quotient + " and the Remainder is " + remainder + " of the two numbers " + num1 + " and " + num2);

        scn.close();

        /*
        input:

        20
        6

        output:
        The Quotient is 3 and the Remainder is 2 of the two numbers 20 and 6
        */
    }
}
