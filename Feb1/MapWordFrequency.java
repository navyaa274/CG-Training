package Feb1;
import java.util.*;

public class MapWordFrequency {
    public static void main(String[] args) {
        String text = "Hello world, hello Java!";
        Map<String, Integer> wordCount = countWords(text);
        System.out.println("Word frequency: " + wordCount);
    }

    public static Map<String, Integer> countWords(String text) {
        Map<String, Integer> wordCount = new HashMap<>();
        String cleanText = text.toLowerCase().replaceAll("[^a-zA-Z\\s]", "");
        String[] words = cleanText.split("\\s+");

        for (String word : words) {
            if (!word.isEmpty()) {
                wordCount.put(word, wordCount.getOrDefault(word, 0) + 1);
            }
        }
        return wordCount;
    }
}
