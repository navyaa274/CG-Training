package Dec31.Level1Assignment;
import java.util.*;

public class Question9 {
    public static void main(String[] args) {
        
        /*
        Q9: Write a new program similar to the program # 6 but take user input for Student Fee and 
        University Discount
        */

        double courseFee, discountPercentage;

        Scanner scn = new Scanner(System.in);

        courseFee = scn.nextDouble();
        discountPercentage = scn.nextDouble();

        double discountAmount = (discountPercentage / 100) * courseFee;
        double discountedPrice = courseFee - discountAmount;

        System.out.println("The discount amount is INR " + discountAmount + " and final discounted fee is INR " + discountedPrice);

        scn.close();

        /*
        input:
        
        125000
        15

        output:

        The discount amount is INR 18750.0 and final discounted fee is INR 106250.0
        */
    }
}
