package Dec31.Level2Assignment;
import java.util.*;

public class Question5 {
    public static void main(String[] args) {
        
        /*
        Q5: Write a TemperaturConversion program, given the temperature in Fahrenheit as input 
        outputs the temperature in Celsius
        */

        double fahrenheit, celsiusResult;

        Scanner scn = new Scanner(System.in);

        fahrenheit = scn.nextDouble();

        celsiusResult = (fahrenheit - 32) * 5/9;

        System.out.println("The " + fahrenheit + " fahrenheit is " + celsiusResult + " celsius");

        scn.close();

        /*
        input:

        125

        output:
        The 125.0 fahrenheit is 51.666666666666664 celsius
        */
    }
}
