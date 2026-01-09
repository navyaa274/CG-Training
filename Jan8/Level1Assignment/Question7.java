package Jan8.Level1Assignment;
import java.util.Scanner;

/*
Q7: Write a program to demonstrate NumberFormatException
*/

public class Question7 {

    public static void generateException(String text) {
        int num = Integer.parseInt(text);
        System.out.println(num);
    }

    public static void handleException(String text) {
        try {
            int num = Integer.parseInt(text);
            System.out.println(num);
        } catch (NumberFormatException e) {
            System.out.println("NumberFormatException handled successfully.");
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