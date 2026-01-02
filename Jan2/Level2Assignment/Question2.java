package Jan2.Level2Assignment;
import java.util.Scanner;

public class Question2 {
    public static void main(String[] args) {
        double salary;
        int serviceYear;

        Scanner scn = new Scanner(System.in);

        salary = scn.nextDouble();
        serviceYear = scn.nextInt();

        if(serviceYear > 5){
            double bonus = salary * 0.05;
            System.out.println("Bonus: " + bonus);
        }
        else{
            System.out.println("No Bonus");
        }

        scn.close();
    }
    
}
