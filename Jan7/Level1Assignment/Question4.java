package Jan7.Level1Assignment;
import java.util.Scanner;

/*
Q5: Write a program to check whether a number is positive, negative, or zero.
*/

public class Question4 {
    public static int checkNumber(int num) {
        if (num > 0) return 1;
        if (num < 0) return -1;
        return 0;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();

        System.out.println("Result: " + checkNumber(num));

        sc.close();
    }
}
