package Dec31.Level1Assignment;
import java.util.*;

public class Question13 {
    public static void main(String[] args) {
        
        /*
        Q13: Write a program to find the side of the square whose parameter you read from user
        */

        double perimeter;

        Scanner scn = new Scanner(System.in);

        perimeter = scn.nextDouble();
        double side = perimeter / 4;

        System.out.println("The length of the side is " + side + " whose perimeter is " + perimeter);

        scn.close();

        /*
        input:
        
        28

        output:
        The length of the side is 7.0 whose perimeter is 28.0
        */
    }
}
