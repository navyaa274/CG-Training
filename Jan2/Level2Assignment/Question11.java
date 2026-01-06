package Jan2.Level2Assignment;
import java.util.Scanner;

public class Question11 {
    public static void main(String[] args) {
        /*
        Q11: Create a program to find all the multiples of a number taken as user input below 100.
        */

        int num;

        Scanner scn = new Scanner(System.in);

        num = scn.nextInt();

        System.out.println("Multiples of " + num + " below 100 are: ");
        for (int i = 1; i * num < 100; ++i) {
            System.out.print(i * num + " ");
        }

        scn.close();
    }
}
