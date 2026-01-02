package Jan2.Level1Assignmet;
import java.util.*;

public class Question8 {
    public static void main(String[] args) {
        
        /*
        Q8: Write a program to count down the number from the user input value to 1 using a while loop 
        for a rocket launch
        */

        int count;

        Scanner scn = new Scanner(System.in);
        
        count = scn.nextInt();

        while(count >= 1){
            System.out.println(count);
            count--;
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