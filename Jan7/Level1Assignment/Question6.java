package Jan7.Level1Assignment;
import java.util.Scanner;

/*
Q6: Write a program to find the sum of n natural numbers using loop
*/

public class Question6 {
    public static int findSum(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i;
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        System.out.println("Sum of natural numbers: " + findSum(n));

        sc.close();
    }
}
