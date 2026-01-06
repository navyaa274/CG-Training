package Jan2.Level1Assignmet;
import java.util.*;

public class Question3 {
    public static void main(String[] args) {
     
        /*
            Q3: Write a program to check if the first, second, or third number is the largest of the three.
        */

        int num1, num2, num3;
        boolean isNum1Largest = false;
        boolean isNum2Largest = false; 
        boolean isNum3Largest = false;

        Scanner scn = new Scanner(System.in);

        num1 = scn.nextInt();
        num2 = scn.nextInt();
        num3 = scn.nextInt();

        if(num1 > num2){
            if(num1 > num3){
                isNum1Largest = true;
            }
            else{
                isNum3Largest = true;
            }
        }
        else{
            if(num2 > num3){
                isNum2Largest = true;
            }
            else{
                isNum3Largest = true;
            }
        }

        System.out.println("Is the first number the largest? " + isNum1Largest + "\nIs the second number the largest? " + isNum2Largest + "\nIs the third number the largest? " + isNum3Largest);

        scn.close();

        /*
        input:

        120
        196
        552

        output:
        Is the first number the largest? false
        Is the second number the largest? false
        Is the third number the largest? true
        */
    }
}
