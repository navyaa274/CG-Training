package Jan30;
import java.io.*;
import java.util.*;

public class Question9 {

    //Compare StringBuilder, StringBuffer, FileReader, and InputStreamReader
    public static void compare(String largeFilePath, String charsetName) {
        int times = 1_000_000;
        String text = "hello";

        long startBuilder = System.nanoTime();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < times; i++) {
            sb.append(text);
        }
        long endBuilder = System.nanoTime();
        long timeBuilder = endBuilder - startBuilder;

        long startBuffer = System.nanoTime();
        StringBuffer bf = new StringBuffer();
        for (int i = 0; i < times; i++) {
            bf.append(text);
        }
        long endBuffer = System.nanoTime();
        long timeBuffer = endBuffer - startBuffer;

        System.out.println("Concat using StringBuilder (ns): " + timeBuilder);
        System.out.println("Concat using StringBuffer  (ns): " + timeBuffer);

        long startFR = System.nanoTime();
        long wordsFR = countWordsWithFileReader(largeFilePath);
        long endFR = System.nanoTime();
        long timeFR = endFR - startFR;
        System.out.println("FileReader - words: " + wordsFR + ", time (ns): " + timeFR);

        long startISR = System.nanoTime();
        long wordsISR = countWordsWithInputStreamReader(largeFilePath, charsetName);
        long endISR = System.nanoTime();
        long timeISR = endISR - startISR;
        System.out.println("InputStreamReader - words: " + wordsISR + ", time (ns): " + timeISR);
    }

    private static long countWordsWithFileReader(String filePath) {
        long count = 0;
        try (FileReader fr = new FileReader(filePath);
             BufferedReader br = new BufferedReader(fr)) {

            String line;
            while ((line = br.readLine()) != null) {
                String[] words = line.trim().split("\\s+");
                if (words.length == 1 && words[0].isEmpty()) {
                    continue;
                }
                count += words.length;
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return count;
    }

    private static long countWordsWithInputStreamReader(String filePath, String charsetName) {
        long count = 0;
        try (FileInputStream fis = new FileInputStream(filePath);
             InputStreamReader isr = new InputStreamReader(fis, charsetName);
             BufferedReader br = new BufferedReader(isr)) {

            String line;
            while ((line = br.readLine()) != null) {
                String[] words = line.trim().split("\\s+");
                if (words.length == 1 && words[0].isEmpty()) {
                    continue;
                }
                count += words.length;
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter large file path: ");
        String path = sc.nextLine();
        System.out.print("Enter charset (e.g. UTF-8): ");
        String charset = sc.nextLine();
        compare(path, charset);
        sc.close();
    }
}
