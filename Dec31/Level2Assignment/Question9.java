package Dec31.Level2Assignment;
import java.util.*;

public class Question9 {
    public static void main(String[] args) {
        
        /*
        Q9: An athlete runs in a triangular park with sides provided as input by the user in meters. If the 
        athlete wants to complete a 5 km run, then how many rounds must the athlete complete
        */

        double side1, side2, side3, perimeter, totalDistance = 5000;

        Scanner scn = new Scanner(System.in);

        side1 = scn.nextDouble();
        side2 = scn.nextDouble();
        side3 = scn.nextDouble();

        perimeter = side1 + side2 + side3;
        double rounds = totalDistance / perimeter;

        System.out.println("The total number of rounds the athlete will run is " + rounds + " to complete 5 km");

        scn.close();

        /*
        input:

        60
        80
        100

        output:
        The total number of rounds the athlete will run is 20.833333333333332 to complete 5 km
        */
    }
}
