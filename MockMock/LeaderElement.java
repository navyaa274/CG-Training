package MockMock;
import java.util.*;

public class LeaderElement {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scn.nextInt();
        }

        leader(arr, n);
    }

    public static void leader(int[] arr, int n) {
        ArrayList<Integer> list = new ArrayList<>();
        boolean leader = true;
        for (int i = 0; i < n; i++) {
            leader = true;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] > arr[i]) {
                    leader = false;
                    continue;
                }
            }
            if (leader)
                list.add(arr[i]);
        }

        System.out.println(list);
    }
}
