package M1TestPractice;

import java.util.Scanner;

public class EncodedWord {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();

        String ans = decode(s);
        System.out.println(ans);
    }
    public static String decode(String s) {
        String ans = "";
        String[] arr = s.split("0");
        for (int i = 0; i < arr.length; i++) {
            char ch = (char) ('A'+(arr[i].length()-1));
            ans = ans + ch;
        }
        return ans;
    }
}
