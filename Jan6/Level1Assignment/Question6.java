package Jan6.Level1Assignment;
import java.util.Scanner;

public class Question6 {
    public static void main(String[] args) {
        /*
        Q6: Create a program to find the mean height of players present in a football team.
        */

        double[] height = new double[11];
        double sum =0;

        Scanner scn = new Scanner(System.in);

        for(int i=0; i<height.length; i++){
            height[i] = scn.nextDouble();
        }

        for(int i=0; i<height.length; i++){
            sum += height[i];
        }

        double mean = sum/height.length;

        System.out.println("The mean height of the football team is: " + mean);

        scn.close();
    }
}