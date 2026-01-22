package Jan9_CG_Codes;
import java.util.Arrays;
import java.util.Scanner;

/*
Q24: Check if two strings are anagrams.
*/

public class AnagramStrings {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        String str1 = scn.nextLine();
        String str2 = scn.nextLine();

        //Method 1 (re-arrangement)
        char[] arr1 = str1.toCharArray();
        char[] arr2 = str2.toCharArray();

        Arrays.sort(arr1);
        Arrays.sort(arr2);

        String s1 = String.valueOf(arr1);
        String s2 = String.valueOf(arr2);

        System.out.println(s1.equals(s2));

        //Method 2 (frequency array)
        str1 = str1.toLowerCase();
        str2 = str2.toLowerCase();

        int[] arr = new int[26];

        for(int i = 0; i < str1.length(); i++){
            arr[str1.charAt(i) - 'a']++;
        }
        for(int i = 0; i < str2.length(); i++){
            arr[str2.charAt(i) - 'a']--;
        }

        for(int i = 0; i < 26; i++){
            if(arr[i] != 0){
                System.out.print("false");
                return;
            }
        }
        System.out.println("true");
        scn.close();
    }
}