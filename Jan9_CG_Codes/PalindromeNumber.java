package Jan9_CG_Codes;
import java.util.Scanner;

/*
Q3. Check if number is a palindrome.
*/

public class PalindromeNumber {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int num = scn.nextInt();

        int temp = num;
        int rev = 0;

        while(temp > 0){
            int digit = temp %10;
            rev = rev * 10 + digit;
            temp = temp/10;
        }

        if(rev == num){
            System.out.println("Palindrome Number");
        }
        else{
            System.out.println("Not a Palindrome Number");
        }

        scn.close();
    }
}
