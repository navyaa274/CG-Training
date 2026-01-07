package Jan6.Level1Assignment;
import java.util.Scanner;

public class Question5 {
    public static void main(String[] args) {

        /*
        Q5: Create a program to find the multiplication table of a number entered by the user from 6 to 9
        and display the result
        */

        int n;
        int[] result = new int[4];

        Scanner scn = new Scanner(System.in);
        n = scn.nextInt();

        for(int i = 0; i<result.length; i++){
            result[i] = n*(i+6);
        }

        for(int i = 0; i<result.length; i++){
            System.out.println(n + " x " + (i+6) + " = " + result[i]);
        }

        scn.close();
    }
}