package Jan28.StacksAndQueues;
import java.util.*;

public class Question2 {
    public static void main(String[] args) {
        System.out.println("=== Sort Stack Using Recursion ===");
        Stack<Integer> stack = new Stack<>();
        stack.push(3); stack.push(1); stack.push(4); stack.push(2);

        Question2.sortStack(stack);

        while (!stack.isEmpty()) {
            System.out.print(stack.pop() + " "); // 1 2 3 4
        }
        System.out.println();
    }

    static void sortStack(Stack<Integer> stack) {
        if (stack.size() > 1) {
            int temp = stack.pop();
            sortStack(stack);
            insertSorted(stack, temp);
        }
    }

    static void insertSorted(Stack<Integer> stack, int item) {
        if (stack.isEmpty() || stack.peek() >= item) {
            stack.push(item);
            return;
        }
        int temp = stack.pop();
        insertSorted(stack, item);
        stack.push(temp);
    }
}