package Jan7.Level1Assignment;
import java.util.Scanner;

/*
Q1: Write a program to input the Principal, Rate, and Time values and calculate Simple Interest.
*/

public class Question1 {
  public static double calculateSimpleInterest(double principal, double rate, double time) {
        return (principal * rate * time) / 100;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double principal = sc.nextDouble();
        double rate = sc.nextDouble();
        double time = sc.nextDouble();

        double si = calculateSimpleInterest(principal, rate, time);

        System.out.println("The Simple Interest is " + si + " for Principal " + principal + ", Rate of Interest " + rate + " and Time " + time);

        sc.close();
    }
}
