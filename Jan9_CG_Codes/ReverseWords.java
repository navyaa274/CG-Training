package Jan9_CG_Codes;
import java.util.Scanner;

/*
Q2: Reverse words in a sentence.
eg: Input: "Hello World"
    Output: "olleH dlroW"
*/

public class ReverseWords {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String s = scn.nextLine();

        String[] words = s.split(" ");
        String reverse = "";

        for(String word : words){
            String revWord = "";
            for(int i = word.length() - 1; i >= 0; i--){
                revWord += word.charAt(i);
            }
            reverse += revWord + " ";
        }

        System.out.println("Reversed Sentence: " + reverse.trim());
        scn.close();
    }
}