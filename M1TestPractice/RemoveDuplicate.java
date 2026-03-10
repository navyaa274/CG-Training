package M1TestPractice;

import java.util.Scanner;

public class RemoveDuplicate {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String str = scn.nextLine();

        String ans = remove(str);
        System.out.println(ans);
    }

    public static String remove(String str) {
        String ans = "";
        String[] arr = str.split("");
        for(String c : arr){
            if(!ans.contains(c)){
                ans += c;
            }
        }
        return ans;
    }
}
