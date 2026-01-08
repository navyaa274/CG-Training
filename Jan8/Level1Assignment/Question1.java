package Jan8.Level1Assignment;
import java.util.Scanner;

/*
Q1: Write a program to compare two strings using the charAt() method and check the result
with the built-in String equals() method
*/

public class Question1 {

    public static boolean compareStrings(String a, String b){
        if(a.length() != b.length()){
            return false;
        }

        int ind = 0;
        while(ind < a.length()){
            if(a.charAt(ind) == b.charAt(ind)){
                ind++;
            }
            else{
                return false;
            }
        }
        return true;
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