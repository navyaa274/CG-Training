package Jan9_CG_Codes;
import java.util.Scanner;

/*
Q19: Find factorial of a number.
 */

public class FactorialOfNumber {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        int factorial = 1;
        for (int i = 1; i <= n; i++) {
            factorial *= i;
        }

        System.out.println(factorial);
    }
}
