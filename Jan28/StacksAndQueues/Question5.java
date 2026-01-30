package Jan28.StacksAndQueues;
import java.util.*;

public class Question5 {
    public static void main(String[] args) {
        System.out.println("=== Circular Tour Problem ===");
        int[] petrol = {1, 2, 3, 4, 5};
        int[] distance = {3, 4, 5, 1, 2};
        int start = Question5.findStartingPoint(petrol, distance);
        System.out.println("Starting point: " + start); // 3
    }

    static int findStartingPoint(int[] petrol, int[] distance) {
        int n = petrol.length;
        int surplus = 0;
        int totalSurplus = 0;
        int start = 0;

        for (int i = 0; i < n; i++) {
            surplus += petrol[i] - distance[i];
            totalSurplus += petrol[i] - distance[i];

            if (surplus < 0) {
                start = i + 1;
                surplus = 0;
            }
        }

        return totalSurplus >= 0 ? start : -1;
    }
}