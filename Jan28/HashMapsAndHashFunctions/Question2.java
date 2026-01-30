package Jan28.HashMapsAndHashFunctions;
import java.util.*;

public class Question2 {
    public static void main(String[] args) {
        System.out.println("=== Check Pair with Given Sum ===");
        int[] arr = {1, 4, 45, 6, 10, -8, 10};
        int target = 16;
        boolean found = Question2.hasPairWithSum(arr, target);
        System.out.println("Pair exists: " + found); // true (6+10)
    }

    static boolean hasPairWithSum(int[] arr, int target) {
        Set<Integer> seen = new HashSet<>();

        for (int num : arr) {
            if (seen.contains(target - num)) {
                return true;
            }
            seen.add(num);
        }
        return false;
    }
}