package MockMock;
import java.util.*;

public class SelectiveReverse {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String str = scn.nextLine();

        selectRev(str);
    }

    private static void selectRev(String str) {
        String[] arr = str.split(" ");
        int n = arr.length;
        String ans = "";

        for (int i = 0; i < n; i++){

            if(i%2!=0)
                arr[i] = reverse(arr[i]);
            ans += arr[i] + " ";
        }
        System.out.println(ans.trim());
    }

    public static String reverse(String s){
        String res = "";
        for (int i = s.length()-1; i >= 0; i--){
            res += s.charAt(i);
        }
        return res;
    }
}