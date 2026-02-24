package MockMock;
import java.util.*;

public class LongestUniqueSubstring {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String s = scn.next();

        int ans = longestSubstring(s);
        System.out.println(ans);
    }
    public static int longestSubstring(String s) {
        int maxLen = 0;
        int left = 0;

        for(int right = 0; right < s.length(); right++) {
            for(int i = left; i < right; i++) {
                if(s.charAt(i) == s.charAt(right)) {
                    left = i + 1;
                    break;
                }
            }
            maxLen = Math.max(maxLen, right - left + 1);
        }
        return maxLen;
    }

}
