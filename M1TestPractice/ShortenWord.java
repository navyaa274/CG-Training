package M1TestPractice;

import java.util.Scanner;

public class ShortenWord {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String s = scn.nextLine();

        String ans = shorten(s);
        System.out.println(ans);
    }

    public static String shorten(String s) {
        String[] arr = s.split(" ");
        String ans = "";
        for(String str : arr){
            if(str.length()<10)ans+=str+" ";
            else{
                int len = str.length();
                ans += str.charAt(0);
                ans += (len-2);
                ans += str.charAt(len-1)+" ";
            }
        }
        return ans.trim();
    }
}
