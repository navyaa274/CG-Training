package Jan7.Level1Assignment;
import java.util.Scanner;

/*
Q9: Create a program to divide N number of chocolates among M children. Print the number of
chocolates each child will get and also the remaining chocolates
*/

public class Question9 {
    public static int[] findRemainderAndQuotient(int chocolates, int children) {
        int each = chocolates / children;
        int remaining = chocolates % children;
        return new int[]{each, remaining};
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int chocolates = sc.nextInt();
        int children = sc.nextInt();

        int[] result = findRemainderAndQuotient(chocolates, children);

        System.out.println("Each child gets: " + result[0]);
        System.out.println("Remaining chocolates: " + result[1]);

        sc.close();
    }
}
