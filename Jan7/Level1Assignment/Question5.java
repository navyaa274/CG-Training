package Jan7.Level1Assignment;
import java.util.Scanner;

/*
Q5: Write a program SpringSeason that takes two int values month and day from the command
line and prints “Its a Spring Season” otherwise prints “Not a Spring Season”.
*/

public class Question5 {
    public static boolean isSpringSeason(int month, int day) {
        if (month == 3 && day >= 20) return true;
        if (month == 4 || month == 5) return true;
        if (month == 6 && day <= 20) return true;
        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int month = sc.nextInt();
        int day = sc.nextInt();

        if (isSpringSeason(month, day))
            System.out.println("Its a Spring Season");
        else
            System.out.println("Not a Spring Season");

        sc.close();
    }
}
