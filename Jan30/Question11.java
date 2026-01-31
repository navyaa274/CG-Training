package Jan30;
import java.util.*;

public class Question11 {

    //Search for a Specific Word in a List of Sentences
    public static String wordSearch(String[] sentences, String word) {
        for (String sentence : sentences) {
            if (sentence != null && sentence.contains(word)) {
                return sentence;
            }
        }
        return "Not Found";
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("How many sentences? ");
        int n = Integer.parseInt(sc.nextLine());
        String[] sentences = new String[n];
        System.out.println("Enter " + n + " sentences:");
        for (int i = 0; i < n; i++) {
            sentences[i] = sc.nextLine();
        }
        System.out.print("Enter word to search: ");
        String word = sc.nextLine();
        String result = wordSearch(sentences, word);
        System.out.println("Result: " + result);
        sc.close();
    }
}