package Jan2.Level3Assignment;
import java.util.Scanner;

public class Question1 {
    public static void main(String[] args) {
        /*
        Q1: Write a LeapYear program that takes a year as input and outputs the Year is a Leap Year or not a Leap Year.
        */

        int year;
        
        Scanner scanner = new Scanner(System.in);
        
        year = scanner.nextInt();

        if(year < 1582) {
            System.out.println("Year is not in Gregorian calendar.");
        }
        else {
            // Using multiple if-else statements

            if(year % 4 == 0) {
                if(year % 100 == 0) {
                    if(year % 400 == 0) {
                        System.out.println("Year is a Leap Year.");
                    }
                    else {
                        System.out.println("Year is not a Leap Year.");
                    }
                }
                else {
                    System.out.println("Year is a Leap Year.");
                }
            }
            else {
                System.out.println("Year is not a Leap Year.");
            }
        }
        scanner.close();
    }
}
