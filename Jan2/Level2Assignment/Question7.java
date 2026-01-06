package Jan2.Level2Assignment;
import java.util.Scanner;

public class Question7 {
    public static void main(String[] args) {
    
    /*
    Q7: Create a program to find the factors of a number taken as user input.
    */

    int num;

    Scanner scn = new Scanner(System.in);

    num = scn.nextInt();

    System.out.println("Factors of " + num + " are: ");
    for (int i = 1; i <= num; ++i) {
        // if i is a factor of num
        if (num % i == 0) {
            System.out.print(i + " ");
        }
    }
    
    scn.close();
    }
}
