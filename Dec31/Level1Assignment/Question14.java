package Dec31.Level1Assignment;
import java.util.*;

public class Question14 {
    public static void main(String[] args) {

        /*
        Q14: Write a program the find the distance in yards and miles for the distance provided by user in 
        feets
        */

        double distanceInFeet;

        Scanner scn = new Scanner(System.in);

        distanceInFeet = scn.nextDouble();
        
        double distanceInYards = distanceInFeet / 3;
        double distanceInMiles = distanceInYards / 1760;

        System.out.println("Distance in yards: " + distanceInYards + "\nDistance in miles: " + distanceInMiles);

        scn.close();

        /*
        input:

        15820

        output:
        Distance in yards: 5273.333333333333
        Distance in miles: 2.996212121212121
        */
    }
}
