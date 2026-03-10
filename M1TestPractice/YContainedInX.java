package M1TestPractice;

import java.util.Scanner;

public class YContainedInX {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String str1 = scn.nextLine();
        String str2 = scn.nextLine();

        String ans = contain(str1, str2);
        System.out.println(ans);
    }

    public static String contain(String str1, String str2) {
        if (str2.length() > str1.length()) return "No";

        if(str1.contains(str2)) return "Yes";

        return "No";
    }
}
