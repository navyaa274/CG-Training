package Dec31.Level1Assignment;

public class Question6 {
    public static void main(String[] args) {
        
        /*
        Q6: The University is charging the student a fee of INR 125000 for the course. The University is 
        willing to offer a discount of 10%. Write a program to find the discounted amount and 
        discounted price the student will pay for the course.
        */

        double courseFee = 125000;
        double discountPercentage = 10;

        double discountAmount = (discountPercentage / 100) * courseFee;
        double discountedPrice = courseFee - discountAmount;

        System.out.println("The discount amount is INR " + discountAmount + " and final discounted fee is INR " + discountedPrice);

        /*
        output:

        The discount amount is INR 12500.0 and final discounted fee is INR 112500.0
        */
    }
}
