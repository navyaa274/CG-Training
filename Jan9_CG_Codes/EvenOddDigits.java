package Jan9_CG_Codes;
import java.util.Scanner;

/*
Q21: Count even and odd digits in a number.
*/

public class EvenOddDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int temp = n;

        while(temp>0){
            int digit = temp%10;
            if(digit%2==0){
                System.out.println(digit + ": EVEN");
            }
            else{
                System.out.println(digit + ": ODD");
            }
            temp = temp/10;
        }
    }
}