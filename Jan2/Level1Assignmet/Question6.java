package Jan2.Level1Assignmet;
import java.util.*;

public class Question6 {
    public static void main(String[] args) {
        /*
        Q6: Write a program to check whether a number is positive, negative, or zero.
        */

        int num;

        Scanner scn = new Scanner(System.in);

        num = scn.nextInt();

        if(num < 0){
            System.out.print("NEGATIVE");
        }
        else if(num == 0){
            System.out.println("ZERO");
        }
        else{
            System.out.println("POSITIVE");
        }

        scn.close();

        /*
        input1:

        -5

        output1:
        NEGATIVE


        input2:

        0

        output2:
        ZERO


        input3:
        
        18

        output3:
        POSITIVE
        */
    }
}
