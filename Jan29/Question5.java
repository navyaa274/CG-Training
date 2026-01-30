package Jan29;

public class Question5 {
    public static void main(String[] args) {
        System.out.println("=== Fibonacci Computation ===");
        int[] ns = {10, 30, 40};

        for (int n : ns) {
            // Recursive O(2^n)
            long start = System.nanoTime();
            int rec = fibonacciRecursive(n);
            long recTime = (System.nanoTime() - start) / 1_000_000;

            // Iterative O(N)
            start = System.nanoTime();
            int iter = fibonacciIterative(n);
            long iterTime = (System.nanoTime() - start) / 1_000_000;

            System.out.printf("N=%d: Rec=%.0fms (result=%d), Iter=%.2fms (result=%d)%n", n, (double)recTime, rec, (double)iterTime, iter);
        }
    }

    static int fibonacciRecursive(int n) {
        if (n <= 1) return n;
        return fibonacciRecursive(n - 1) + fibonacciRecursive(n - 2);
    }

    static int fibonacciIterative(int n) {
        if (n <= 1) return n;
        int a = 0, b = 1;
        for (int i = 2; i <= n; i++) {
            int sum = a + b;
            a = b;
            b = sum;
        }
        return b;
    }
}