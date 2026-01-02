package Jan2.Level1Assignmet;

import java.util.Scanner;

public class Question5 {
    public static void main(String[] args) {
        
        /*
        Q5: Write a program to check whether a person can vote, depending on whether his/her age is 
        greater than or equal to 18.
        */
        
        int age;

        Scanner scn = new Scanner(System.in);

        age = scn.nextInt();

        if(age >= 18){
            System.out.print("The person's age is " + age + " and can vote.");
        }
        else{
            System.out.print("The person's age is " + age + " and cannot vote.");
        }

        scn.close();

        /*
        input1:

        17

        output1:
        The person's age is 17 and cannot vote.


        input2:

        18

        output2:
        The person's age is 18 and can vote.
        */
    }
}
