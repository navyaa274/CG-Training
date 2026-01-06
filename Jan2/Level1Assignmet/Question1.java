package Jan2.Level1Assignmet;
import java.util.*;

public class Question1 {
    public static void main(String[] args) {
        
        /*
        Q1: Write a program to check if a number is divisible by 5
        */
        
        int number;
        boolean isDivisible;

        Scanner scn = new Scanner(System.in);

        number = scn.nextInt();

        if(number%5 == 0){
            isDivisible = true;
            System.out.println("Is the number " + number + " divisible by 5? " + isDivisible);
        }
        else{
            isDivisible = false;
            System.out.println("Is the number " + number + " divisible by 5? " + isDivisible);
        }

        scn.close();


        /*
        input1:

        25

        output1:
        Is the number 25 divisible by 5? true


        input2:

        24

        output2:
        Is the number 24 divisible by 5? false
        */
    }
}
