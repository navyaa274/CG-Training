package M1TestPractice;

import java.util.Arrays;
import java.util.Scanner;

public class Anagrams {
    public static void main(String[] args) {
        Scanner scn  = new Scanner(System.in);
        String s1 = scn.nextLine();
        String s2 = scn.nextLine();

        String ans = anagramCheck(s1, s2);
        System.out.println(ans);
    }

    public static String anagramCheck(String s1, String s2) {
        char[] arr1 = s1.toCharArray();
        char[] arr2 = s2.toCharArray();
        Arrays.sort(arr1);
        Arrays.sort(arr2);

        int i = 0;
        int j = 0;
        while(i<arr1.length && j<arr2.length){
            if(arr1[i]== ' ')i++;
            else if(arr2[j] == ' ')j++;
            else if(arr1[i] == arr2[j]){
                i++;
                j++;
            }
            else return "No";
        }
        return "Yes";
    }
}