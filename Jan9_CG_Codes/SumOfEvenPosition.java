package Jan9_CG_Codes;
import java.util.Scanner;

/*
Q23: Sum of even-position digits.
 */

public class SumOfEvenPosition {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        int n = scn.nextInt();
        int temp = n;
        int sum = 0;
        int count = 0;

        while(temp>0){
            int digit = temp%10;
            count ++;
            temp = temp/10;
        }

        if(count%2==0){

        }
    }
}
