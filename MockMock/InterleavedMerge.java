package MockMock;
import java.util.*;

public class InterleavedMerge {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String s1 =  scn.next();
        String s2 =  scn.next();

        String ans = merge(s1, s2);
        System.out.println(ans);
    }

    public static String merge(String s1, String s2){
        int a = s1.length();
        int b = s2.length();
        String res = "";

        int i = 0;
        int j = 0;
        while(i<a && j<b){
            res += s1.charAt(i);
            res += s2.charAt(j);
            i++;
            j++;
        }
        if(i<a)
            res += s1.substring(i);
        if(j<b)
            res += s2.substring(j);

        return res;
    }
}
