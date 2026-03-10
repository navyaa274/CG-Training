package M1TestPractice;

import java.util.HashMap;
import java.util.Scanner;

public class MaxOccurringCharacter {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String s =  scn.nextLine();

        char ans = countOccurrence(s);
        System.out.println(ans);
    }

    public static char countOccurrence(String s){
        char c = 'a';
        int max = 0;
        int count = 0;
        HashMap<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }

        for(HashMap.Entry<Character, Integer> entry : map.entrySet()){
            if(entry.getValue() > max){
                max = entry.getValue();
                c = entry.getKey();
                count = 1;
            }
            else if(entry.getValue() == max){
                count++;
            }
        }
        if (count > 1) return '0';
        return c;
    }
}
