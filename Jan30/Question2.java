package Jan30;
import java.util.*;

public class Question2 {

    // Remove duplicate characters, keep order
    public static String removeDuplicate(String input) {
        StringBuilder sb = new StringBuilder();
        HashSet<Character> seen = new HashSet<>();

        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            if (!seen.contains(ch)) {
                seen.add(ch);
                sb.append(ch);
            }
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter string: ");
        String s = sc.nextLine();
        System.out.println("Without duplicates: " + removeDuplicate(s));
        sc.close();
    }
}