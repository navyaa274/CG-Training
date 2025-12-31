package Dec31.Level2Assignment;
import java.util.*;

public class Question3 {
    public static void main(String[] args) {

        /*
        Q3: Similarly, write the DoubleOpt program by taking double values and doing the same 
        operations.
        */

        double a, b, c;

        Scanner scn = new Scanner(System.in);

        a = scn.nextDouble();
        b = scn.nextDouble();
        c = scn.nextDouble();

        double op1 = a + b * c;
        double op2 = a * b + c;
        double op3 = c + a / b;
        double op4 = a % b + c;

        System.out.println("The results of Double operations are: " + op1 + ", " + op2 + ", " + op3 + ", and " + op4);

        scn.close();

        /*
        input:

        5
        9
        10

        output:
        The results of Double operations are: 95.0, 55.0, 10.555555555555555, and 15.0
        */
    }
}
