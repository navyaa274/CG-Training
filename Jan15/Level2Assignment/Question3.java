package Jan15.Level2Assignment;

/*
Q4: Create a PalindromeChecker class with an attribute text. Add methods to:
Check if the text is a palindrome.
Display the result.

 */

class PalindromeChecker {
    String text;

    boolean isPalindrome() {
        String cleaned = text.toLowerCase().replaceAll("[^a-zA-Z0-9]", "");
        int left = 0, right = cleaned.length() - 1;
        while (left < right) {
            if (cleaned.charAt(left) != cleaned.charAt(right)) return false;
            left++; right--;
        }
        return true;
    }

    void displayResult() {
        System.out.println("Text: '" + text + "'");
        System.out.println("Is Palindrome: " + isPalindrome());
        System.out.println();
    }
}

public class Question3 {
    public static void main(String[] args) {
        PalindromeChecker pc1 = new PalindromeChecker();
        pc1.text = "A man a plan a canal Panama";
        pc1.displayResult();

        PalindromeChecker pc2 = new PalindromeChecker();
        pc2.text = "hello";
        pc2.displayResult();

        PalindromeChecker pc3 = new PalindromeChecker();
        pc3.text = "racecar";
        pc3.displayResult();
    }
}