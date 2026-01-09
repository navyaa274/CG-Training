package Jan8.Level1Assignment;
import java.util.Scanner;

/*
Q9: Write a program to convert the complete text to uppercase and compare the results
*/

public class Question9 {

    public static String convertToUpperCase(String s){
        String ans = "";

        for(int i = 0; i<s.length(); i++){
            char c = s.charAt(i);
            if(c >= 97){
                c -= 32;
            }
            ans += c;
        }
        return ans;
    }

    public static boolean compareStrings(String a, String b){
        if(a.length() != b.length()){
            return false;
        }

        for(int i = 0; i<a.length(); i++){
            if(a.charAt(i) != b.charAt(i)){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();

        String userDefined = convertToUpperCase(s);
        String inBuilt = s.toUpperCase();

        boolean result = compareStrings(userDefined, inBuilt);

        System.out.println("Converted using user defined method:\n" + userDefined + "\nConverted using inbuilt method:\n" + inBuilt + "\n\nAre the two same?\n" + result);

        sc.close();
    }
}
