package Dec31.Level1Assignment;
import java.util.*;

public class Question16 {
    public static void main(String[] args) {
        
        /*
        Q16: Create a program to find the maximum number of handshakes among N number of 
        students.
        */

        int numberOfStudents;

        Scanner scn = new Scanner(System.in);

        numberOfStudents = scn.nextInt();

        int maxHandshakes = (numberOfStudents * (numberOfStudents - 1)) / 2;

        System.out.println("The maximum number of handshakes among " + numberOfStudents + " students is " + maxHandshakes);

        scn.close();

        /*
        input:

        53

        output:
        The maximum number of handshakes among 53 students is 1378
        */
    }
}
