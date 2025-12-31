package Dec31.Level1Assignment;
import java.util.*;

public class Question15 {
    public static void main(String[] args) {
        
        /*
        Q15: Write a program to input the unit price of an item and the quantity to be bought. Then, 
        calculate the total price.
        */

        double unitPrice, quantity;

        Scanner scn = new Scanner(System.in);

        unitPrice = scn.nextDouble();
        quantity = scn.nextDouble();

        double totalPrice = unitPrice * quantity;

        System.out.println("The total purchase price is INR " + totalPrice + " if the quantity " + quantity + " and unit price is INR " + unitPrice);

        scn.close();

        /*
        input:
        
        26
        50

        output:

        The total purchase price is INR 1300.0 if the quantity 50.0 and unit price is INR 26.0

        */  
    }
}