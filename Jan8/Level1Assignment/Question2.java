package Jan8.Level1Assignment;
import java.util.Scanner;

/*
Q2: Write a program to create a substring from a String using the charAt() method. Also, use
the String built-in method substring() to find the substring of the text. Finally Compare the
two strings and display the results
*/
public class Question2 {

    public static String createSubstring(String a, int start, int end){
        String s = "";
        
        for(int i = start; i<end; i++){
            char c = a.charAt(i);
            s += c;
        }

        return s;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int start, end;

        String a = sc.next();
        start = sc.nextInt();
        end = sc.nextInt();

        String s = createSubstring(a, start, end);
        String str = a.substring(start, end);

        boolean result = s.equals(str);

        System.out.println("Substring using user-defined method: \n" + s + "\nSubstring using inbuilt method: \n" + str + "\nBoth substrings are equal?\n" + result);
        
        sc.close();
    }
}
