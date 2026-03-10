package M1TestPractice;

import java.util.Scanner;

public class RepeatString {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        String s = scn.next();

        String ans = repeat(s, n);
        System.out.println(ans);
    }

    public static String repeat(String s, int n) {
        String ans = "";
        for (int i = 0; i < n; i++) {
            ans += s;
        }
        return ans;
    }
}
