package Jan2.Level2Assignment;
import java.util.Scanner;

public class Question6 {
    
    /*
    Q6: Create a program to find the youngest friends among 3 Amar, Akbar, and Anthony based on 
    their ages and the tallest among the friends based on their heights
    */
    public static void main(String[] args) {
        int age1, age2, age3;
        int height1, height2, height3;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter age: ");
        age1 = scanner.nextInt();
        age2 = scanner.nextInt();
        age3 = scanner.nextInt();

        System.out.print("Enter height (in cm): ");
        height1 = scanner.nextInt();
        height2 = scanner.nextInt();
        height3 = scanner.nextInt();

        // Finding the youngest
        if (age1 < age2 && age1 < age3) {
            System.out.println("Amar is the youngest.");
        } else if (age2 < age1 && age2 < age3) {
            System.out.println("Akbar is the youngest.");
        } else if (age3 < age1 && age3 < age2) {
            System.out.println("Anthony is the youngest.");
        } else {
            System.out.println("There is a tie for the youngest age.");
        }

        // Finding the tallest
        if (height1 > height2 && height1 > height3) {
            System.out.println("Amar is the tallest.");
        } else if (height2 > height1 && height2 > height3) {
            System.out.println("Akbar is the tallest.");
        } else if (height3 > height1 && height3 > height2) {
            System.out.println("Anthony is the tallest.");
        } else {
            System.out.println("There is a tie for the tallest height.");
        }

        scanner.close();
    }
}
