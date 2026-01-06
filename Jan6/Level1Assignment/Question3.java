package Jan6.Level1Assignment;
import java.util.Scanner;

public class Question3 {
    public static void main(String[] args) {
        
        /*
        Q3: Create a program to print a multiplication table of a number.
        */ 
       
        int num;
        Scanner scn = new Scanner(System.in);

        num = scn.nextInt();

        int[] product = new int[10];

        for(int i = 0; i<product.length; i++){
            product[i] = num * (i+1);
        }

        for(int i = 0; i<product.length; i++){
           System.out.println(num + " x " + (i+1) + " = " + product[i]);
        }

        scn.close();
    }
}
