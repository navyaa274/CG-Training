package Dec31.Level2Assignment;
import java.util.*;

public class Question7 {
    public static void main(String[] args) {
        
        /*
        Q7: Create a program to swap two numbers
        */

        int num1, num2, temp;

        Scanner scn = new Scanner(System.in);

        num1 = scn.nextInt();
        num2 = scn.nextInt();

        temp = num1;
        num1 = num2;
        num2 = temp;

        System.out.println("The swapped numbers are " + num1 + " and " + num2);

        scn.close();

        /*
        input:

        56
        69

        output:
        The swapped numbers are 69 and 56
        */
    }
}
