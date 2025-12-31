package Dec31.Level1Assignment;
import java.util.*;

public class Question8 {
    public static void main(String[] args) {
        
        /*
        Q8: Create a program to convert distance in kilometers to miles.
        */
        
        double km;

        Scanner scn = new Scanner(System.in);

        km = scn.nextDouble();

        double mile = km / 1.6;

        System.out.println("The total miles is " + mile + " mile for the given " + km + " km");

        scn.close();

        /*
        input:

        10

        output:

        The total miles is 6.25 mile for the given 10.0 km
        */
    }
}
