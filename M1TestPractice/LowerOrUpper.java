package M1TestPractice;

import java.util.Scanner;

public class LowerOrUpper {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String s =  scn.nextLine();

        String ans = convert(s);
        System.out.println(ans);
    }

    public static String convert(String s){
        int lower = 0;
        int upper = 0;
        for(char c : s.toCharArray()){
            if(Character.isLowerCase(c))lower++;
            else if(Character.isUpperCase(c))upper++;
        }
        if(lower > upper) s = s.toLowerCase();
        else if(lower < upper) s = s.toUpperCase();
        return s;
    }
}
