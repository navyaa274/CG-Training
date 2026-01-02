package Jan2.Level1Assignmet;
import java.util.*;

public class Question7 {
    public static void main(String[] args) {
        
        /*
        Q7: Write a program SpringSeason that takes two int values month and day from the command 
        line and prints “Its a Spring Season” otherwise prints “Not a Spring Season”.
        */

        int month, day;

        Scanner scn = new Scanner(System.in);

        month = scn.nextInt();
        day = scn.nextInt();

        if(month >= 3 && month <= 6) {
            if(month == 3 && day >= 20) {
                System.out.println("It's a Spring Season");
            }
            else if(month == 6 && day <= 20) {
                System.out.println("It's a Spring Season");
            }
            else if(month > 3 && month < 6) {
                System.out.println("It's a Spring Season");
            }
            else {
                System.out.println("Not a Spring Season");
            }
        }
        else {
            System.out.println("Not a Spring Season");
        }

        scn.close();

        /*
        input1:
        
        4
        25

        output1:
        It's a Spring Season


        input2:

        3
        18

        output2:
        Not a Spring Season
        */
    }
}
