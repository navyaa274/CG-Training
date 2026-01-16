package Jan9_CG_Codes;
import java.util.Scanner;

/*
Q17: Remove vowels from a string.
 */

public class RemoveVowels {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        String s = scn.nextLine();

        String vowels = "aeiouAEIOU";
        String str = "";

        for(int i = 0; i<s.length(); i++){
            char c = s.charAt(i);
            if(vowels.indexOf(c) != -1){
                continue;
            }
            else{
                str += c;
            }
        }

        System.out.println(str);
        scn.close();
    }
}