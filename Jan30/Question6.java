package Jan30;
import java.io.*;
import java.util.*;

public class Question6 {

    //Count the Occurrence of a Word in a File Using FileReader
    public static int wordOccurrence(String filePath, String targetWord) {
        int count = 0;

        try (FileReader fr = new FileReader(filePath);
             BufferedReader br = new BufferedReader(fr)) {

            String line;
            targetWord = targetWord.trim();

            while ((line = br.readLine()) != null) {
                String[] words = line.split("\\s+");
                for (String w : words) {
                    if (w.equals(targetWord)) {
                        count++;
                    }
                }
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter file path: ");
        String path = sc.nextLine();
        System.out.print("Enter word to search: ");
        String word = sc.next();
        int c = wordOccurrence(path, word);
        System.out.println("Occurrences: " + c);
        sc.close();
    }
}