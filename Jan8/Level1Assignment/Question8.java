package Jan8.Level1Assignment;
import java.util.Scanner;

/*
Q8: Write a program to demonstrate ArrayIndexOutOfBoundsException
*/

public class Question8 {
    
    public static void generateException(String[] names) {
        System.out.println(names[names.length]);
    }

    public static void handleException(String[] names) {
        try {
            System.out.println(names[names.length]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("ArrayIndexOutOfBoundsException handled successfully.");
        } catch (RuntimeException e) {
            System.out.println("Generic RuntimeException handled.");
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        String[] names = new String[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Enter name " + (i + 1) + ": ");
            names[i] = sc.next();
        }

        try {
            generateException(names);
        } catch (RuntimeException e) {
            System.out.println("Exception generated in generateException()");
        }

        handleException(names);
        sc.close();
    }
}