package Jan6.Level1Assignment;
import java.util.Scanner;

public class Question2 {
    public static void main(String[] args) {
        
        /*
        Q2: Write a program to take user input for 5 numbers and check whether a number is positive,
        negative, or zero. Further for positive numbers check if the number is even or odd. Finally
        compare the first and last elements of the array and display if they equal, greater or less
        */

        int[] num = new int[5];

        Scanner scn = new Scanner(System.in);

        for(int i = 0; i < num.length; i++){
            num[i] = scn.nextInt();
        }

        for(int i = 0; i < num.length; i++){
            if(num[i] > 0){
                if(num[i] % 2 == 0){
                    System.out.println("Positive    Even");
                }
                else{
                    System.out.println("Positive    Odd");
                }
            }
            else if(num[i] == 0){
                System.out.println("Zero");
            }
            else{
                System.out.println("Negative");
            }
        }

        if(num[0] > num[num.length-1]){
            System.out.println("First element of array " + num[0] + " is grester than the last element " + num[num.length-1] + " of array");
        }
        else if(num[0] == num[num.length-1]){
            System.out.println("First element of array " + num[0] + " is equal to last element " + num[num.length-1] + " of array");
        }
        else{
            System.out.println("First element of array " + num[0] + " is smaller than the last element " + num[num.length-1] + " of array");
        }

        scn.close();
    }
}
