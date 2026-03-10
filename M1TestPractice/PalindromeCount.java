package M1TestPractice;

import java.util.Scanner;

public class PalindromeCount {
    public static void main(String[] args) {
        Scanner scn  = new Scanner(System.in);
        String str = scn.nextLine();
        int n = scn.nextInt();

        int ans = countPali(str);
        System.out.println(ans);
    }

    public static int countPali(String str) {
        String[] arr = str.split(" ");
        int ans = 0;
        for (String s : arr) {
            if (s.equals(reverse(s)))
                ans++;
        }
        return ans;
    }

    public static String reverse(String str) {
       String ans = "";
       for (int i = str.length()-1; i>=0 ; i--) {
           ans += str.charAt(i);
       }
       return ans;
    }
}
