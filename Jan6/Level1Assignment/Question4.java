package Jan6.Level1Assignment;
import java.util.Scanner;

public class Question4 {
    public static void main(String[] args) {
        
        /*
        Q4: Write a program to store multiple values in an array up to a maximum of 10 or until the user
        enters a 0 or a negative number. Show all the numbers as well as the sum of all numbers
        */

        double[] num = new double[10];
        double total;

        Scanner scn = new Scanner(System.in);

        while(true){
            int i = 0;
            double n = scn.nextDouble();
            if(n == 0 || n<0 || i>10){
                break;
            }
            num[i] = n;
        }
    }
}
