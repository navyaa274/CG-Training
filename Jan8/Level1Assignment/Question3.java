package Jan8.Level1Assignment;
import java.util.Scanner;

/*
Q3: Write a program to return all the characters in a string using the user-defined method,
compare the result with the String built-in toCharArray() method, and display the result
*/

public class Question3 {

    public static char[] getCharacters(String s) {
        char[] chars = new char[s.length()];
        for (int i = 0; i < s.length(); i++) {
            chars[i] = s.charAt(i);
        }
        return chars;
    }

    public static boolean compareArrays(char[] arr1, char[] arr2) {
        if (arr1.length != arr2.length) {
            return false;
        }

        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] != arr2[i]) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();

        char[] userChars = getCharacters(s);

        char[] builtInChars = s.toCharArray();

        boolean result = compareArrays(userChars, builtInChars);

        System.out.println("Characters using user-defined method:");
        for (char c : userChars) {
            System.out.print(c + " ");
        }

        System.out.println("\nCharacters using toCharArray():");
        for (char c : builtInChars) {
            System.out.print(c + " ");
        }

        System.out.println("\n\nAre both character arrays equal? " + result);
        sc.close();
    }
    
}