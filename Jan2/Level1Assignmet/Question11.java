package Jan2.Level1Assignmet;
import java.util.*;

public class Question11 {
  public static void main(String[] args) {
    
    /*
    Q11: Write the program to find the sum until the user enters 0 or a negative number using 
    while loop and break statement
    */

    double total = 0;
    double num;

    Scanner scn = new Scanner(System.in);

    while(true){
        num = scn.nextDouble();

        if(num <=0){
            break;
        }

        total += num;
    }

    System.out.println(total);

    scn.close();

    /*
    input:

    5
    1
    5
    5
    -5

    output:
    16.0
    */
  }  
}
