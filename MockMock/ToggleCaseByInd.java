package MockMock;
import java.util.*;

public class ToggleCaseByInd {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String s = scn.nextLine();

        System.out.println(toggle(s));
    }

    public static String toggle(String s) {
        String[] words = s.split(" ");
        StringBuilder result = new StringBuilder();
        for(String word : words) {
            for(int i = 0; i < word.length(); i++) {
                char c = word.charAt(i);
                if(i % 2 == 0) {
                    if(Character.isLowerCase(c)) {
                        result.append((char)(c - 32));
                    } else {
                        result.append(c);
                    }
                } else {
                    if(Character.isUpperCase(c)) {
                        result.append((char)(c + 32));
                    } else {
                        result.append(c);
                    }
                }
            }
            result.append(" ");
        }
        return result.toString().trim();
    }

}
