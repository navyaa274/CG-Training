package Jan9_CG_Codes;
import java.util.Scanner;

/*
Q18: Convert binary to decimal and vice versa.
*/

public class BinaryToDecimal {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        System.out.println("1. Binary to Decimal");
        System.out.println("2. Decimal to Binary");
        int choice = scn.nextInt();

        int n = scn.nextInt();

        if (choice == 1) {
            int decimal = 0;
            int power = 0;
            int temp = n;
            while (temp != 0) {
                int digit = temp % 10;
                decimal += digit * (int)Math.pow(2, power);
                power++;
                temp /= 10;
            }

            System.out.println("Decimal: " + decimal);
        }
        else if (choice == 2) {
            int decimal = n;
            int binary = 0;
            int place = 1;
            while (decimal != 0) {
                int rem = decimal % 2;
                binary += rem * place;
                place *= 10;
                decimal /= 2;
            }
            System.out.println("Binary: " + binary);
        } else {
            System.out.println("Invalid choice");
        }

        scn.close();
    }
}