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
            count ++;
            temp = temp/10;
        }

        if(count%2==0){
            sum += n%10;
            while(n>0){
                n = n/100;
                sum += n%10;
            }
        }
        else{
            n = n/10;
            while(n>0){
                sum += n%10;
                n = n/100;
            }
        }

        System.out.println(sum);
        scn.close();
    }
}