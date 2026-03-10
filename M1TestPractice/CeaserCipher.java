package M1TestPractice;

import java.util.Scanner;

public class CeaserCipher {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        String ans = cipher(str);
        System.out.println(ans);
    }

    public static String cipher(String str){
        String ans = "";
        str = str.toLowerCase();
        for (char c : str.toCharArray()) {
            if (c >= 'a' && c <= 'z') {
                char shifted = (char) (((c - 'a' + 3) % 26) + 'a');
                ans = ans + shifted;
            }
        }
        return ans;
    }
}