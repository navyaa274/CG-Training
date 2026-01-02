package Jan2.Level3Assignment;
import java.util.Scanner;

public class Question3 {
    public static void main(String[] args) {
        int physics, chemistry, mathematics, avg;
        float percentage;

        Scanner scanner = new Scanner(System.in);
         
        System.out.println("Enter marks in Physics:");
        physics = scanner.nextInt();

        System.out.println("Enter marks in Chemistry:");
        chemistry = scanner.nextInt();

        System.out.println("Enter marks in Mathematics:");
        mathematics = scanner.nextInt();

        avg = (physics + chemistry + mathematics) / 3;
        percentage = (physics + chemistry + mathematics) / 3.0f;

        System.out.println("Average Marks: " + avg);
        if(percentage >= 80) {
            System.out.println("Grade: A\nRemarks: Level 4, above agency-normalized standards");
        }
        else if(percentage >= 70 && percentage < 80) {
            System.out.println("Grade: B\nRemarks: Level 3, at agency-normalized standards");
        }
        else if(percentage >= 60 && percentage < 70) {
            System.out.println("Grade: C\nRemarks: Level 2, below, but approaching agency-normalized standards");
        }
        else if(percentage >= 50 && percentage < 60) {
            System.out.println("Grade: D\nRemarks: Level 1, well below agency-normalized standards");
        }
        else if(percentage >= 40 && percentage < 50) {
            System.out.println("Grade: E\nRemarks: Level 1-, too below agency-normalized standards");
        }
        else {
            System.out.println("Grade: R\nRemarks: Remedial standards");
        }
        
        scanner.close();
    }
}
