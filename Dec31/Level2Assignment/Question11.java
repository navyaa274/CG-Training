package Dec31.Level2Assignment;
import java.util.*;

public class Question11 {
    public static void main(String[] args) {
        
        /*
        Q11: Write a program to input the Principal, Rate, and Time values and calculate Simple Interest.
        */

        double principal, rate, time, simpleInterest;

        Scanner scn = new Scanner(System.in);

        principal = scn.nextDouble();
        rate = scn.nextDouble();
        time = scn.nextDouble();

        simpleInterest = (principal * rate * time) / 100;

        System.out.println("The Simple Interest is " + simpleInterest + " for Principal " + principal + ", Rate of interest " + rate + " and Time is " + time);

        scn.close();

        /*
        input:

        10000
        5
        3

        output:
        The Simple Interest is 1500.0 for Principal 10000.0, Rate of interest 5.0 and Time is 3.0
        */
    }
}
