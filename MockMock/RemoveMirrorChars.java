package MockMock;
import java.util.*;

public class RemoveMirrorChars {
    public static void main(String[] args) {
        Scanner scn  = new Scanner(System.in);
        String s = scn.next();

        String ans = removeMirr(s);
        System.out.println(ans);
    }

    public static String removeMirr(String s) {
        int n = s.length();
        String l = s.substring(0, n/2);
        String r = s.substring(n/2);

        String revR = "";
        for (int i = r.length()-1; i >= 0; i--){
            revR += r.charAt(i);
        }

        if(l.equals(revR))
            return l;
        return s;
    }
}
