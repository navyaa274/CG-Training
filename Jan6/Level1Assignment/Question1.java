package Jan6.Level1Assignment;
import java.util.Scanner;

public class Question1 {
    public static void main(String[] args) {
        
        /*
        Q1: Write a program to take user input for the age of all 10 students in a class and check
        whether the student can vote depending on his/her age is greater or equal to 18.
        */

        int[] age = new int[10];
        Scanner scn = new Scanner(System.in);

        for(int i = 0; i < age.length; i++){
            age[i] = scn.nextInt();
        }

        for(int i = 0; i < age.length; i++){
            if(age[i] < 0){
                System.out.println("Invalid Age");
            }
            else if(age[i] < 18){
                System.out.println("The Student with the age " + age[i] + ", cannot vote");
            }
            else{
                System.out.println("The Student with the age " + age[i] + ", can vote");
            }
        }

        scn.close();
    }
}
