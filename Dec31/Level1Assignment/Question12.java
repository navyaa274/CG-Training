package Dec31.Level1Assignment;
import java.util.*;

public class Question12 {
    public static void main(String[] args) {
        
        /*
        Q12: Write a program that takes the base and height to find area of a triangle in square inches and square centimeters.
        */

        double baseInInches, heightInInches;

        Scanner scn = new Scanner(System.in);

        baseInInches = scn.nextDouble();
        heightInInches = scn.nextDouble();

        double areaInSquareInches = 0.5 * baseInInches * heightInInches;
        double areaInSquareCm = areaInSquareInches * (2.54 * 2.54);

        System.out.println("The area of triangle with base " + baseInInches + " inches and height " + heightInInches + " inches is " + areaInSquareInches + " square inches and " + areaInSquareCm + " square centimeters");

        scn.close();

        /*
        input:

        5
        10

        output:
        The area of triangle with base 5.0 inches and height 10.0 inches is 25.0 square inches and 161.29 square centimeters
        */
    }
}
