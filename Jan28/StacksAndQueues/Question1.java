package Jan28.StacksAndQueues;
import java.util.*;

import java.util.*;

public class Question1 {
    public static void main(String[] args) {
        System.out.println("=== Queue Using Stacks ===");
        Stack<Integer> enqueueStack = new Stack<>();
        Stack<Integer> dequeueStack = new Stack<>();

        enqueue(enqueueStack, dequeueStack, 1);
        enqueue(enqueueStack, dequeueStack, 2);
        enqueue(enqueueStack, dequeueStack, 3);
        System.out.println(dequeue(enqueueStack, dequeueStack)); // 1
        System.out.println(dequeue(enqueueStack, dequeueStack)); // 2
        System.out.println(dequeue(enqueueStack, dequeueStack)); // 3
    }

    static void enqueue(Stack<Integer> enqueueStack, Stack<Integer> dequeueStack, int item) {
        enqueueStack.push(item);
    }

    static int dequeue(Stack<Integer> enqueueStack, Stack<Integer> dequeueStack) {
        if (dequeueStack.isEmpty()) {
            while (!enqueueStack.isEmpty()) {
                dequeueStack.push(enqueueStack.pop());
            }
        }
        return dequeueStack.pop();
    }
}