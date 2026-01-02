package Jan2.Level1Assignmet;

import java.util.Scanner;

public class Question15 {
    public static void main(String[] args) {
        
        /*
        Q15: Write a Program using for loop to find the factorial of an integer entered by the user
        */

        int num;
        int factorial = 1;
        
        Scanner scn = new Scanner(System.in);

        num = scn.nextInt();

        if(num <=0){
            System.out.println("Enter positive number!");
        }
        else{
            for (int i = num; i > 0; i--) {
                factorial *= i;
            }
        }

        System.out.println("Factorial: " + factorial);

        scn.close();
    }
}
