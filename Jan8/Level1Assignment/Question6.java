package Jan8.Level1Assignment;
import java.util.Scanner;

/*
Q6: Write a program to demonstrate IllegalArgumentException
*/

public class Question6 {

    public static void generateException(String text) {
        System.out.println(text.substring(5, 2));
    }

    public static void handleException(String text) {
        try {
            System.out.println(text.substring(5, 2));
        } catch (IllegalArgumentException e) {
            System.out.println("IllegalArgumentException handled successfully.");
        } catch (RuntimeException e) {
            System.out.println("Generic RuntimeException handled.");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.next();

        try {
            generateException(input);
        } catch (RuntimeException e) {
            System.out.println("Exception generated in generateException()");
        }

        handleException(input);
        sc.close();
    }
    
}