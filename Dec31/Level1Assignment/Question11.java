package Dec31.Level1Assignment;
import java.util.*;

public class Question11 {
    public static void main(String[] args) {
        
        /*
        Q11: Write a program to create a basic calculator that can perform addition, subtraction, 
        multiplication, and division. The program should ask for two numbers (floating point) and 
        perform all the operations
        */

        float number1, number2;

        Scanner scn = new Scanner(System.in);

        number1 = scn.nextFloat();
        number2 = scn.nextFloat();

        float addition = number1 + number2;
        float subtraction = number1 - number2;  
        float multiplication = number1 * number2;
        float division = number1 / number2;

        System.out.println("The addition, subtraction, multiplication and division value of 2 numbers " + number1 + " and " + number2 + " is " + addition + ", " + subtraction + ", " + multiplication + " and " + division);

        scn.close();

        /*
        input:

        52
        95

        output:
        The addition, subtraction, multiplication and division value of 2 numbers 52.0 and 95.0 is 147.0, -43.0, 4940.0 and 0.5473684
        */
    }
}
