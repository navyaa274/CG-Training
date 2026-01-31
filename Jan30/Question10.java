package Jan30;
import java.util.*;

public class Question10 {

    //Search for the First Negative Number
    public static int isNegative(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 0) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter " + n + " integers:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int index = isNegative(arr);
        if (index == -1) {
            System.out.println("No negative number: " + index);
        }
        else {
            System.out.println("First negative index: " + index);
        }
        sc.close();
    }
}