package Jan7.Level1Assignment;
import java.util.Scanner;

/*
Q7: Write a program to find the smallest and the largest of the 3 numbers.
*/

public class Question7 {
    public static int[] findSmallestAndLargest(int a, int b, int c) {
        int smallest = Math.min(a, Math.min(b, c));
        int largest = Math.max(a, Math.max(b, c));
        return new int[]{smallest, largest};
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        int[] result = findSmallestAndLargest(a, b, c);

        System.out.println("Smallest: " + result[0]);
        System.out.println("Largest: " + result[1]);

        sc.close();
    }
}