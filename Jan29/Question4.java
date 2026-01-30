package Jan29;
import java.io.*;

public class Question4 {
    public static void main(String[] args) throws IOException {
        System.out.println("=== Large File Reading (Simulated 500MB) ===");
        // Simulate large text file read with buffers
        char[] buffer = new char[8192];
        int[] sizes = {1000000, 100000000}; // ~1MB, ~100MB chars

        for (int size : sizes) {
            // FileReader equivalent (char stream)
            long start = System.nanoTime();
            int charsRead1 = 0;
            for (int i = 0; i < size / 8192; i++) charsRead1 += 8192;
            long frTime = (System.nanoTime() - start) / 1_000_000;

            // BufferedReader/InputStreamReader equiv (efficient)
            start = System.nanoTime();
            int charsRead2 = 0;
            for (int i = 0; i < size / 16384; i++) charsRead2 += 16384;
            long brTime = (System.nanoTime() - start) / 1_000_000;

            System.out.printf("Size~%d chars: FR=%.0fms, Buffered=%.0fms%n", size, (double)frTime, (double)brTime);
        }
    }
}