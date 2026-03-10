package M1TestPractice;

import java.util.Scanner;

public class NumberReverse {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        int ans = reverse(n);
        System.out.println(ans);
    }

    public static int reverse(int n){
        int temp = n;
        int rev = 0;
        while(temp!=0){
            int rem = temp%10;
            rev = rev*10 + rem;
            temp = temp/10;
        }
        return rev;
    }
}
