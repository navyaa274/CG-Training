package Jan9_CG_Codes;
import java.util.Scanner;

/*
Q8: Generate Fibonacci series upto N terms.
*/
public class FibonacciSeries {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        int N = scn.nextInt();

        int a = 0;
        int b = 1;
        int c;

        if(N == 1){
            System.out.print(a);
        }
        else if(N == 2){
            System.out.print(a + " " + b);
        }
        else{
            System.out.print(a + " " + b);
            for(int i = 3; i<= N; i++){
                c = a+b;
                a = b;
                b = c;
                System.out.print(" " + c);
            }
        }

        scn.close();
    }
}