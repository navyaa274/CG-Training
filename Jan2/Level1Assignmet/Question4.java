package Jan2.Level1Assignmet;
import java.util.*;

public class Question4 {
    public static void main(String[] args) {
        /*
        Q4: Write a program to check for the natural number and write the sum of n natural numbers
        */

        int num, sum;

        Scanner scn = new Scanner(System.in);

        num = scn.nextInt();

        if(num <= 0){
            System.out.println("The number " + num + " is not a natural number");
        }
        else{
            sum = (num * (num + 1) / 2);
            System.out.println("The sum of " + num + " natural numbers is " + sum);
        }

        scn.close();

        /*
        input1:

        5

        output1:
        The sum of 5 natural numbers is 15


        input2:

        -10

        output2:
        The number -10 is not a natural number
        */
    }
}
