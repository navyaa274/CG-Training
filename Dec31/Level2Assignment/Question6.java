package Dec31.Level2Assignment;
import java.util.*;

public class Question6 {
    public static void main(String[] args) {
        
        /*
        Q6: Create a program to find the total income of a person by taking salary and bonus from user
        */

        double salary, bonus, totalIncome;

        Scanner scn = new Scanner(System.in);

        salary = scn.nextDouble();
        bonus = scn.nextDouble();

        totalIncome = salary + bonus;

        System.out.println("The salary is INR " + salary + " and bonus is INR " + bonus + ". Hence Total Income is INR " + totalIncome);
        
        scn.close();

        /*
        input:

        5000000
        25000

        output:
        The salary is INR 5000000.0 and bonus is INR 25000.0. Hence Total Income is INR 5025000.0
        */
    }
}
