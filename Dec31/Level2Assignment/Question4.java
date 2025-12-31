package Dec31.Level2Assignment;
import java.util.*;

public class Question4 {
    public static void main(String[] args) {
        
        /*
        Q4: Write a TemperaturConversion program, given the temperature in Celsius as input outputs 
        the temperature in Fahrenheit
        */

        double celsius, fahrenheitResult;

        Scanner scn = new Scanner(System.in);

        celsius = scn.nextDouble();

        fahrenheitResult = (celsius * 9/5) + 32;

        System.out.println("The " + celsius + " celsius is " + fahrenheitResult + " fahrenheit");

        scn.close();

        /*
        input:

        40

        output:
        The 40.0 celsius is 104.0 fahrenheit
        */
    }
}
