package Jan9_CG_Codes;
import java.util.Scanner;

/*
Q6: Sum of Digits of a number.
*/

public class SumOfDigits {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        int sum = 0;
        int temp = n;

        while(temp > 0){
            sum += temp%10;
            temp = temp/10;
        }

        System.out.println("Sum of Digits: " + sum);

        scn.close();
    }
}