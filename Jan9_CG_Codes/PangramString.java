package Jan9_CG_Codes;
import java.util.Scanner;

/*
Q7: Check if string is a pangram
*/

public class PangramString {
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
                System.out.println("Not a pangram string");
                scn.close();
                return;
            }
        }

        System.out.println("Pangram string");
        scn.close();
    }
}