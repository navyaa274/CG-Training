package Jan28.HashMapsAndHashFunctions;
import java.util.*;

public class Question3 {
    public static void main(String[] args) {
        System.out.println("=== Longest Consecutive Sequence ===");
        int[] arr = {100, 4, 200, 1, 3, 2};
        int length = Question3.longestConsecutiveSequence(arr);
        System.out.println("Longest sequence length: " + length); // 4 (1,2,3,4)
    }

    static int longestConsecutiveSequence(int[] arr) {
        Set<Integer> set = new HashSet<>();
        for (int num : arr) {
            set.add(num);
        }

        int maxLength = 0;
        for (int num : set) {
            if (!set.contains(num - 1)) { // start of sequence
                int currentNum = num;
                int currentLength = 1;

                while (set.contains(currentNum + 1)) {
                    currentNum++;
                    currentLength++;
                }
                maxLength = Math.max(maxLength, currentLength);
            }
        }
        return maxLength;
    }
}