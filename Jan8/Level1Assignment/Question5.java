package Jan8.Level1Assignment;
import java.util.Scanner;

/*
Q5: Write a program to demonstrate StringIndexOutOfBoundsException
*/

public class Question5 {

    public static void generateException(String text) {
        System.out.println(text.charAt(text.length()));
    }

    public static void handleException(String text) {
        try {
            System.out.println(text.charAt(text.length()));
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("StringIndexOutOfBoundsException handled successfully.");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.next();

        try {
            generateException(input);
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("Exception generated in generateException()");
        }

        handleException(input);
        sc.close();
    }
}