package Jan8.Level1Assignment;

/*
Q4: Write a program to demonstrate NullPointerException.
*/

public class Question4 {
    public static void generateException() {
        String text = null;
        System.out.println(text.length());
    }

    public static void handleException() {
        String text = null;
        try {
            System.out.println(text.length());
        } catch (NullPointerException e) {
            System.out.println("NullPointerException handled successfully.");
        }
    }

    public static void main(String[] args) {
        try {
            generateException();
        } catch (NullPointerException e) {
            System.out.println("Exception generated in generateException()");
        }

        handleException();
    }
}