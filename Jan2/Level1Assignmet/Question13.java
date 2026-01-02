package Jan2.Level1Assignmet;
import java.util.*;

public class Question13 {
    public static void main(String[] args) {
        
        /*
        Q13: Write a program to find the sum of n natural numbers using for loop compare the result 
        with the formulae n*(n+1)/2 and show the result from both computations was correct.
        */

        int num;
        int loopSum = 0;
        int formulaSum = 0;

        Scanner scn = new Scanner(System.in);

        num = scn.nextInt();

        if(num <= 0){
            System.out.println("Not a natural number");
        }
        else{
            formulaSum = (num * (num + 1) / 2);

            for(int i= num; i > 0; i--){
                loopSum += i;
            }

            if(formulaSum == loopSum){
                System.out.println("Sum with formula: " + formulaSum + "\nSum with loop: " + loopSum + "\nBoth are equal!");
            }
            else{
                System.out.println("Sum with formula: " + formulaSum + "\nSum with loop: " + loopSum + "\nBoth are not equal!");
            }
        }

        scn.close();

        /*
        input1:

        5

        output1:
        Sum with formula: 15
        Sum with loop: 15
        Both are equal!

        input2:

        -6

        output2:
        Not a natural number
        */
    }
    
}
