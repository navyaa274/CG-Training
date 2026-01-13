package Jan9_CG_Codes;
import java.util.Scanner;

/*
Q12: Print prime numbers in a range
*/

public class PrimeNumbers {
    public static void main(String[] args) {
        Scanner  scn = new Scanner(System.in);

        int n = scn.nextInt();

        System.out.print(1 + " ");
        for(int i = 3; i <= n; i++){
            boolean isPrime = true;
            for(int j = 2; j < i; j++){
                if(i%j==0){
                    isPrime = false;
                    break;
                }
            }
            if(isPrime){
            System.out.print(i + " ");
            }
        }

        scn.close();
    }
}
