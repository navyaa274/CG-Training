package Jan9_CG_Codes;
import java.util.Scanner;

/*
Q11: Check for prime number
*/

public class CheckPrime {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        int n = scn.nextInt();

        for(int i = 2; i < n; i++){
            if(n%i==0){
                System.out.println("Not prime");
                scn.close();
                return;
            }
        }
        System.out.println("Prime number");

        scn.close();
    }
}
