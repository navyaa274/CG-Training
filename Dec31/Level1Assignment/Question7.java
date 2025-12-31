package Dec31.Level1Assignment;

public class Question7 {
    public static void main(String[] args) {
        
        /*
        Q7: Write a Program to compute the volume of Earth in km^3 and miles^3
        */

        double earthRadiusKm = 6378;

        double volumeCubicKm = (4.0/3.0) * Math.PI * Math.pow(earthRadiusKm, 3);

        double volumeCubicMiles = volumeCubicKm / (0.6 * 0.6 * 0.6);

        System.out.println("The volume of Earth in cubic kilometers is " + volumeCubicKm + " and cubic miles is " + volumeCubicMiles);

        /*
        output:

        The volume of Earth in cubic kilometers is 1.0832069168464889E12 and cubic miles is 5.031394872883746E12
        */
    }
}
