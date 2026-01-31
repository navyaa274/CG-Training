package Jan30;
import java.util.Scanner;

public class Question14 {

    //Search for a Target Value in a 2D Sorted Matrix
    public static boolean searchTarget(int[][] matrix, int target) {
        if (matrix == null || matrix.length == 0 || matrix[0].length == 0) {
            return false;
        }

        int rows = matrix.length;
        int cols = matrix[0].length;
        int left = 0;
        int right = rows * cols - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;
            int r = mid / cols;
            int c = mid % cols;
            int value = matrix[r][c];

            if (value == target) {
                return true;
            } else if (value < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter rows: ");
        int r = sc.nextInt();
        System.out.print("Enter columns: ");
        int c = sc.nextInt();
        int[][] matrix = new int[r][c];
        System.out.println("Enter matrix elements row-wise:");
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }
        System.out.print("Enter target to search: ");
        int target = sc.nextInt();
        boolean found = searchTarget(matrix, target);
        System.out.println("Found? " + found);
        sc.close();
    }
}