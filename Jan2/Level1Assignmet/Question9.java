package Jan2.Level1Assignmet;
import java.util.*;

public class Question9 {
    public static void main(String[] args) {
        /*
        Q9: Write a program to count down the number from the user input value to 1 using a for loop 
        for a rocket launch
        */

        int count;

        Scanner scn = new Scanner(System.in);
        
        count = scn.nextInt();

        for(int i = count; i>=1; i-- ){
            System.out.println(i);
        }

        scn.close();

        /*
        input:
        
        10
        
        output:
        10
        9
        8
        7
        6
        5
        4
        3
        2
        1
        */
    }
}
