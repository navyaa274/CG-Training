package MockMock;
import java.util.*;

public class FirstRepeatedString {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        String[] arr = new String[n];

        for (int i = 0; i < n; i++) {
            arr[i] = scn.next();
        }

        String ans = firstRepeat(arr);
        System.out.println(ans);
    }

    public static String firstRepeat(String[] arr) {
        List<String> seen = new ArrayList<>();

        for(String s : arr) {
            if(seen.contains(s)) {
                return s;
            }
            seen.add(s);
        }
        return null;
    }
}
