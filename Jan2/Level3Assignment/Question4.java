package Jan2.Level3Assignment;
import java.util.Scanner;

public class Question4 {
    public static void main(String[] args) {
        /*
        Q4: Write a Program to check if the given number is a prime number or not
        */
        int number;
        boolean isPrime = true;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a number:");
        number = scanner.nextInt();

        if(number <= 1) {
            isPrime = false;
        }
        else {
            for(int i = 2; i <= Math.sqrt(number); i++) {
                if(number % i == 0) {
                    isPrime = false;
                    break;
                }
            }
        }

        if(isPrime) {
            System.out.println(number + " is a prime number.");
        }
        else {
            System.out.println(number + " is not a prime number.");
        }

        scanner.close();
    }
}
