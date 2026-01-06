package Jan2.Level1Assignmet;
import java.util.*;

public class Question2 {
    public static void main(String[] args) {
        /*
        Q2: Write a program to check if the first is the smallest of the 3 numbers.
        */

        int num1, num2, num3;
        boolean isnum1Smallest = false;

        Scanner scn = new Scanner(System.in);

        num1 = scn.nextInt();
        num2 = scn.nextInt();
        num3 = scn.nextInt();

        if(num1 < num2){
            if(num1 < num3){
                isnum1Smallest = true;
            }
        }

        System.out.println("Is the first number the smallest? " + isnum1Smallest);

        scn.close();

        /*
        input:

        10 20 30

        output:
        Is the first number the smallest? true

        input:

        30 20 10

        output:
        Is the first number the smallest? false
        */
    }
}
