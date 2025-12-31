package Dec31.Level2Assignment;
import java.util.*;

public class Question8 {
    public static void main(String[] args) {
        
        /*
        Q8: Eric Travels from Chennai to Bangalore via Vellore. From Chennai to 
        Vellore distance is 156.6 km and the time taken is 4 Hours 4 Mins and from Vellore to Bangalore is 211.8 km and will take 4 Hours 25 Mins. Compute the total distance and total 
        time from Chennai to Bangalore

        Rewrite the Sample Program with user inputs
        */

        String name, fromCity, viaCity, toCity;
        double fromToViaDistance, viaToFinalCityDistance, totalDistance;
        int fromToViaHours, fromToViaMins, viaToFinalCityHours, viaToFinalCityMins;

        Scanner scn = new Scanner(System.in);

        name = scn.nextLine();
        fromCity = scn.nextLine();
        viaCity = scn.nextLine();
        toCity = scn.nextLine();

        fromToViaDistance = scn.nextDouble();
        fromToViaHours = scn.nextInt();
        fromToViaMins = scn.nextInt();

        viaToFinalCityDistance = scn.nextDouble();
        viaToFinalCityHours = scn.nextInt();
        viaToFinalCityMins = scn.nextInt();

        totalDistance = fromToViaDistance + viaToFinalCityDistance;
        int totalHours = fromToViaHours + viaToFinalCityHours + (fromToViaMins + viaToFinalCityMins) / 60;
        int totalMins = (fromToViaMins + viaToFinalCityMins) % 60;

        System.out.println(name + " travels from " + fromCity + " to " + toCity + " via " + viaCity + ". The total distance travelled is " + totalDistance + " km and the total time taken is " + totalHours + " hours " + totalMins + " mins");

        scn.close();

        /*
        input:

        Eric
        Chennai
        Vellore
        Bangalore

        156.6
        4
        4
        
        211.8
        4
        25

        output:
        Eric travels from Chennai to Bangalore via Vellore. The total distance travelled is 368.4 km and the total time taken is 8 hours 29 mins
        */
    }
}
