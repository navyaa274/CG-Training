package Dec31.Level1Assignment;

public class Question1 {
    public static void main(String[] args) {
        
        /*
        Q1: Write a program to find the age of Harry if the birth year is 
        2000. Assume the Current Year is 2024
        */

        int birthYear = 2000;
        int currentYear = 2024;

        int age = currentYear - birthYear;

        System.out.println("Harry's age in 2024 is: " + age);

        /*
        output: 
        
        Harry's age in 2024 is: 24
        */
    }
}