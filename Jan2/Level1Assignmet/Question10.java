package Jan2.Level1Assignmet;
import java.util.*;

public class Question10 {
    public static void main(String[] args) {
        /*
        Q10: Write a program to find the sum of numbers until the user enters 0
        */

        double total = 0;
        double num;

        Scanner scn = new Scanner(System.in);

        num = scn.nextDouble();

        while(num != 0){
            total += num;
            num = scn.nextDouble();
        }

        System.out.println(total);

        scn.close();
        
        /*
        input:

        2
        6
        4
        2
        1
        0

        output:
        15.0
        */
    }
}
