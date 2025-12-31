package Dec31.Level2Assignment;
import java.util.*;

public class Question2 {
    public static void main(String[] args) {

        /*
        Q2: Write an IntOperation program by taking a, b, and c as input values and print the 
        following integer operations a + b *c, a * b + c, c + a / b, and a % b + c. Please also 
        understand the precedence of the operators.
        */

        int a, b, c;

        Scanner scn = new Scanner(System.in);

        a = scn.nextInt();
        b = scn.nextInt();
        c = scn.nextInt();

        int op1 = a + b * c;
        int op2 = a * b + c;
        int op3 = c + a / b;
        int op4 = a % b + c;

        System.out.println("The results of Int operations are: " + op1 + ", " + op2 + ", " + op3 + ", and " + op4);

        scn.close();

        /*
        input:

        5
        9
        10

        output:
        The results of Int operations are: 95, 55, 10, and 15
        */
    }
}
