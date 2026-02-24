package MockMock;
import java.util.*;

public class RotationPalindrome {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String s =  scn.next();

        boolean res = anyRotationPalindrome(s);
        System.out.println(res);
    }

    public static boolean anyRotationPalindrome(String s) {
        char[] arr = s.toCharArray();
        int n = arr.length;
        if (n == 0) return true;

        for (int i = 0; i < n; i++) {
            boolean isPal = true;
            for (int k = 0; k < n / 2; k++) {
                int left = (i + k) % n;
                int right = (i + n - 1 - k) % n;
                if (arr[left] != arr[right]) {
                    isPal = false;
                    break;
                }
            }
            if (isPal) return true;
        }
        return false;
    }

//    public static boolean anyRotationPalindrome(String s) {
//        String doubled = s + s;
//        int n = s.length();
//        for (int i = 0; i < n; i++) {
//            if (isPalindrome(doubled.substring(i, i + n))) {
//                return true;
//            }
//        }
//        return false;
//    }
//
//    private static boolean isPalindrome(String str) {
//        int left = 0, right = str.length() - 1;
//        while (left < right) {
//            if (str.charAt(left++) != str.charAt(right--)) {
//                return false;
//            }
//        }
//        return true;
//    }
}
