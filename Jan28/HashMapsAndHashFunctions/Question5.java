package Jan28.HashMapsAndHashFunctions;
import java.util.*;

public class Question5 {
    public static void main(String[] args) {
        System.out.println("=== Two Sum Problem ===");
        int[] arr = {2, 7, 11, 15};
        int target = 9;
        int[] result = Question5.twoSum(arr, target);
        if (result != null) {
            System.out.println("Indices: " + result[0] + ", " + result[1]); // 0, 1
        }
    }

    static int[] twoSum(int[] arr, int target) {
        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < arr.length; i++) {
            int complement = target - arr[i];
            if (map.containsKey(complement)) {
                return new int[]{map.get(complement), i};
            }
            map.put(arr[i], i);
        }
        return null;
    }
}