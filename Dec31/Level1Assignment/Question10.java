package Dec31.Level1Assignment;
import java.util.*;

public class Question10 {
    public static void main(String[] args) {
        
        /*
        Q10: Write a program that takes your height in centimeters and converts it into feet and inches.
        */
       
        double heightInCm; 

        Scanner scn = new Scanner(System.in);

        heightInCm = scn.nextDouble();

        double totalInches = heightInCm / 2.54;
        int feet = (int)(totalInches / 12);
        int inches = (int)(totalInches % 12);

        System.out.println("Your height in cm is " + heightInCm + " while in feet is " + feet + " and inches is " + inches);

        scn.close();

        /*
        input:

        170

        output:
        Your height in cm is 170.0 while in feet is 5 and inches is 6
        */
    }
}
