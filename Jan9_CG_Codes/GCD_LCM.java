package Jan9_CG_Codes;
import java.util.Scanner;

/*
Q10: Find GCD (HCF) and LCM of two numbers.
*/

public class GCD_LCM {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        int num1 = scn.nextInt();
        int num2 = scn.nextInt();

        int a = num1;
        int b = num2;

        int gcd;
        int lcm;

        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }

        gcd = a;

        lcm = (num1 * num2) / gcd;

        System.out.println("GCD = " + gcd);
        System.out.println("LCM = "+lcm);

        scn.close();
    }
}
