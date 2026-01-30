package Jan28.StacksAndQueues;
import java.util.*;

public class Question3 {
    public static void main(String[] args) {
        System.out.println("=== Stock Span Problem ===");
        int[] prices = {100, 80, 60, 70, 60, 75, 85};
        int[] spans = Question3.calculateSpan(prices);

        for (int span : spans) {
            System.out.print(span + " "); // 1 1 1 2 1 4 6
        }
        System.out.println();
    }

    static int[] calculateSpan(int[] prices) {
        int[] spans = new int[prices.length];
        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < prices.length; i++) {
            while (!stack.isEmpty() && prices[stack.peek()] <= prices[i]) {
                stack.pop();
            }
            spans[i] = stack.isEmpty() ? i + 1 : i - stack.peek();
            stack.push(i);
        }
        return spans;
    }
}