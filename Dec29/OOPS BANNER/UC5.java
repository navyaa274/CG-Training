import java.util.HashMap;

public class UC5 {
    public static HashMap<Character, String[]> getPatterns() {
        HashMap<Character, String[]> patterns = new HashMap<>();

        patterns.put('O', new String[]{
            "   ***   ",
            " **   ** ",
            "**     **",
            "**     **",
            "**     **",
            "**     **",
            "**     **",
            " **   ** ",
            "   ***   "
        });

        patterns.put('P', new String[]{
            "******   ",
            "**    ** ",
            "**     **",
            "**    ** ",
            "******   ",
            "**       ",
            "**       ",
            "**       ",
            "**       "
        });

        patterns.put('S', new String[]{
            "   ***** ",
            " **      ",
            "**       ",
            " **      ",
            "   ***   ",
            "      ** ",
            "       **",
            "      ** ",
            "  *****  "
        });

        return patterns;
    }

    public static void banner(String word, HashMap<Character, String[]> patterns) {
        String[] banner = new String[9];

        for (int i = 0; i < banner.length; i++) {
            banner[i] = "";
        }

        for (char ch : word.toCharArray()) {
            String[] pattern = patterns.get(ch);
            for (int i = 0; i < banner.length; i++) {
                banner[i] += pattern[i] + " ";
            }
        }

        for (String line : banner) {
            System.out.println(line);
        }
    }

    public static void main(String[] args) {
        String word = "OOPS";
        HashMap<Character, String[]> patterns = getPatterns();
        banner(word, patterns);
    }
}
