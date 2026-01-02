package Jan2.Level2Assignment;
import java.util.Scanner;

public class Question13 {
    public static void main(String[] args) {
        /*
        Q13: Create a program to find all the multiples of a number taken as user input below 100 using while loop.
        */

        int num;

        Scanner scn = new Scanner(System.in);
        
        num = scn.nextInt();

        int i = 1;
        System.out.println("Multiples of " + num + " below 100:");
        while (i * num < 100) {
            System.out.print(i * num + " ");
            i++;
        }
        System.out.println();
        
        scn.close();
    }
}
