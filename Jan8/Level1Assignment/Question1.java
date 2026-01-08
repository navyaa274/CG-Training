package Jan8.Level1Assignment;
import java.util.Scanner;

/*
Q1: Write a program to compare two strings using the charAt() method and check the result
with the built-in String equals() method
*/

public class Question1 {

    public static boolean compareStrings(String a, String b){
        boolean isSame = false;
        if(a.length() != b.length()){
            return isSame;
        }

        int ind = 0;
        while(ind < a.length()){
            if(a.charAt(ind) == b.charAt(ind)){
                isSame = true;
                ind++;
            }
            else{
                isSame = false;
                return isSame;
            }
        }
        return isSame;
    }

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        String a = sc.next();
        String b = sc.next();

        boolean isSame = compareStrings(a, b);
        boolean result = a.equals(b);

        System.out.println(isSame + "\n" + result);

        sc.close();
    }
}