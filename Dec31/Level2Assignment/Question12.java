package Dec31.Level2Assignment;
import java.util.*;

public class Question12 {
    public static void main(String[] args) {
        
        /*
        Q12: Create a program to convert weight in pounds to kilograms
        */

        double pounds, kilograms;

        Scanner scn = new Scanner(System.in);

        pounds = scn.nextDouble();

        kilograms = pounds * 2.2;

        System.out.println("The weight of the person in pound is " + pounds + " and in kg is " + kilograms);

        scn.close();

        /*
        input:

        150

        output:
        The weight of the person in pound is 150.0 and in kg is 330.0
        */
    }
}
