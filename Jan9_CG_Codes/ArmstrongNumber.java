package Jan9_CG_Codes;
import java.util.Scanner;

/*
Q9: Check if number is Armstrong
*/

public class ArmstrongNumber {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        int n = scn.nextInt();
        int temp = n;
        int sum = 0;
        int digit = 0;

        while(temp>0){
            digit++;
            temp /= 10;
        }

        temp = n;
        int pow = 0;

        while(temp>0){
            pow = (int)Math.pow(temp%10, digit);
            sum += pow;
            temp /= 10;
        }

        if(sum == n){
            System.out.println("Armstrong Number");
        }
        else{
            System.out.println("Not an Armstrong Number");
        }

        scn.close();
    }
}
