package Jan2.Level2Assignment;
import java.util.Scanner;

public class Question8 {
    public static void main(String[] args) {
    
        /*
        Q8: Create a program to find the factors of a number taken as user input using while loop.
        */

        int num;

        Scanner scn = new Scanner(System.in);

        num = scn.nextInt();

        System.out.println("Factors of " + num + " are: ");
        int i = 1;
        while (i <= num) {
            // if i is a factor of num
            if (num % i == 0) {
                System.out.print(i + " ");
            }
            i++;
        }

        scn.close();
    }
}
