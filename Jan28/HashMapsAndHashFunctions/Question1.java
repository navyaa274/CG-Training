package Jan28.HashMapsAndHashFunctions;
import java.util.*;

public class Question1 {
    public static void main(String[] args) {
        System.out.println("=== Find All Subarrays with Zero Sum ===");
        int[] arr = {3, -1, 0, 4, 1, -2, 1, -1, 0};
        List<List<Integer>> subarrays = Question1.findZeroSumSubarrays(arr);

        for (List<Integer> subarray : subarrays) {
            System.out.print("Subarray: ");
            for (int num : subarray) {
                System.out.print(num + " ");
            }
            System.out.println();
        }
        // Output: [3,-1,0,4,1,-2,1,-1,0] has subarrays like [0], [-1,1], etc.
    }

    static List<List<Integer>> findZeroSumSubarrays(int[] arr) {
        List<List<Integer>> result = new ArrayList<>();
        Map<Integer, List<Integer>> sumToIndices = new HashMap<>();
        int sum = 0;

        sumToIndices.put(0, new ArrayList<>(List.of(-1)));

        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];

            if (sumToIndices.containsKey(sum)) {
                for (int start : sumToIndices.get(sum)) {
                    List<Integer> subarray = new ArrayList<>();
                    for (int j = start + 1; j <= i; j++) {
                        subarray.add(arr[j]);
                    }
                    result.add(subarray);
                }
            }

            sumToIndices.computeIfAbsent(sum, k -> new ArrayList<>()).add(i);
        }
        return result;
    }
}