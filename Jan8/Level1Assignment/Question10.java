package Jan8.Level1Assignment;
import java.util.Scanner;
/*
Q10: Write a program to convert the complete text to lowercase and compare the results
*/

public class Question10 {

    public static String convertToLowerCase(String s){
        String ans = "";

        for(int i = 0; i<s.length(); i++){
            char c = s.charAt(i);
            if(c >= 65 && c <= 90 ){
                c += 32;
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

        String userDefined = convertToLowerCase(s);
        String inBuilt = s.toLowerCase();

        boolean result = compareStrings(userDefined, inBuilt);

        System.out.println("Converted using user defined method:\n" + userDefined + "\nConverted using inbuilt method:\n" + inBuilt + "\n\nAre the two same?\n" + result);

        sc.close();
    }
}
