package Jan7.Level1Assignment;
import java.util.Scanner;

/*
Q2: Create a program to find the maximum number of handshakes among N number of
students.
*/

public class Question2 {
    public static int calculateHandshakes(int n) {
        return (n * (n - 1)) / 2;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        System.out.println("Maximum number of handshakes: " + calculateHandshakes(n));

        sc.close();
    }
}
