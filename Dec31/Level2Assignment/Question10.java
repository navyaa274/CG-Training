package Dec31.Level2Assignment;
import java.util.*;

public class Question10 {
    public static void main(String[] args) {
       
        /*
        Q10: Create a program to divide N number of chocolates among M children.
        */

        int chocolates, children;

        Scanner scn = new Scanner(System.in);

        chocolates = scn.nextInt();
        children = scn.nextInt();

        int chocolatesPerChild = chocolates / children;
        int remainingChocolates = chocolates % children;

        System.out.println("The number of chocolates each child gets is " + chocolatesPerChild + " and the number of remaining chocolates are " + remainingChocolates);

        scn.close();

        /*
        input:

        100
        6

        output:
        The number of chocolates each child gets is 16 and the number of remaining chocolates are 4
        */
    }
}
