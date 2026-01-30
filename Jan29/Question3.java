package Jan29;

public class Question3 {
    public static void main(String[] args) {
        System.out.println("=== String Concatenation Performance ===");
        int[] sizes = {1000, 10000};

        for (int n : sizes) {
            // String O(N²)
            long start = System.nanoTime();
            String str = "";
            for (int i = 0; i < n; i++) str += "a";
            long stringTime = (System.nanoTime() - start) / 1_000_000;

            // StringBuilder O(N)
            start = System.nanoTime();
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < n; i++) sb.append("a");
            long sbTime = (System.nanoTime() - start) / 1_000_000;

            // StringBuffer O(N)
            start = System.nanoTime();
            StringBuffer sbf = new StringBuffer();
            for (int i = 0; i < n; i++) sbf.append("a");
            long sbfTime = (System.nanoTime() - start) / 1_000_000;

            System.out.printf("N=%d: String=%.0fms, SB=%.2fms, SBF=%.2fms%n", n, (double)stringTime, (double)sbTime, (double)sbfTime);
        }
    }
}