package MockMock;
import java.util.*;

public class CharFreqCompression {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String s = scn.next();

        String ans = compress(s);
        System.out.println(ans);
    }

    public static String compress(String s) {
        int n = s.length();
        String res = "";

        char c;
        int count = 0;
        int i = 0;
        while(i < n) {
            c = s.charAt(i);
            count = 0;
            for(char a : s.toCharArray()) {
                if(a == c)
                    count++;
                else
                    continue;
            }
            res = res + c + count;
            i+= count;
        }
        return res;
    }
}
