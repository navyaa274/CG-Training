package Jan30;
import java.util.*;

public class Question1 {

    // Reverse a string using StringBuilder
    public static String reverseString(String input) {
        StringBuilder sb = new StringBuilder();
        sb.append(input);
        sb.reverse();
        return sb.toString();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter string to reverse: ");
        String s = sc.nextLine();
        String reversed = reverseString(s);
        System.out.println("Reversed: " + reversed);
        sc.close();
    }
}