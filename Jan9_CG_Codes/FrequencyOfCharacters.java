package Jan9_CG_Codes;
import java.util.Scanner;

/*
Q16: Count frequency of characters in a string.
*/

public class FrequencyOfCharacters {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        String s = scn.nextLine();
        int[] alphabets = new int[26];

        for(int i = 0; i < s.length(); i++){
            char c = s.charAt(i);

            if (c >= 'A' && c <= 'Z') {
                int ind = c - 'A';
                alphabets[ind]++;
            }
            else if (c >= 'a' && c <= 'z') {
                int ind = c - 'a';
                alphabets[ind]++;
            }
        }

        for(int n : alphabets){
            if(n == 0){
    }
}
