package Jan2.Level1Assignmet;
import java.util.*;

public class Question14 {
    public static void main(String[] args) {
        
        /*
        Q14: Write a Program using while loop to find the factorial of an integer entered by the user
        */

        int num;
        int factorial = 1;
        
        Scanner scn = new Scanner(System.in);

        num = scn.nextInt();

        if(num <=0){
            System.out.println("Enter positive number!");
        }
        else{
            while (num > 0) {
                factorial *= num;
                num --;
            }
        }

        System.out.println("Factorial: " + factorial);

        scn.close();
    }
}
