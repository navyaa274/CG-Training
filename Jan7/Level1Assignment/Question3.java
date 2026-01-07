package Jan7.Level1Assignment;
import java.util.Scanner;

/*
Q3: An athlete runs in a triangular park with sides provided as input by the user in meters. If the
athlete wants to complete a 5 km run, then how many rounds must the athlete complete
*/

public class Question3 {
    public static double calculateRounds(double side1, double side2, double side3) {
        double perimeter = side1 + side2 + side3;
        return 5000 / perimeter;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = sc.nextDouble();

        System.out.println("Number of rounds to complete 5 km: " + calculateRounds(a, b, c));

        sc.close();
    }
}
