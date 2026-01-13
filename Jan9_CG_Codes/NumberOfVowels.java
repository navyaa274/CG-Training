package Jan9_CG_Codes;
import java.util.Scanner;

/*
Q1: Count the number of vowels in a string.
*/

public class NumberOfVowels {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        String s = scn.next();
        String vowels = "aeiouAEIOU";

        int count = 0;

        for(int i = 0; i<s.length(); i++){
            char c = s.charAt(i);
            if(vowels.indexOf(c) != -1){
                count++;
            }
        }
        System.out.println("Number of vowels: " + count);
        scn.close();
    }
}