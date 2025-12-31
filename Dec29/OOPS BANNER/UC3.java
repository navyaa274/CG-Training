public class UC3 {

    public static String[] getOPattern() {
        return new String[]{
            "   ***   ",
            " **   ** ",
            "**     **",
            "**     **",
            "**     **",
            "**     **",
            "**     **",
            " **   ** ",
            "   ***   "
        };
    }

    public static String[] getPPattern() {
        return new String[]{
            "******   ",
            "**    ** ",
            "**     **",
            "**    ** ",
            "******   ",
            "**       ",
            "**       ",
            "**       ",
            "**       "
        };
    }

    public static String[] getSPattern() {
        return new String[]{
            "   ***** ",
            " **      ",
            "**       ",
            " **      ",
            "   ***   ",
            "      ** ",
            "       **",
            "      ** ",
            "  *****  "
        };
    }

    public static String[] buildPattern() {
        String[] o = getOPattern();
        String[] p  = getPPattern();
        String[] s  = getSPattern();

        String[] banner = new String[9];

        for (int i = 0; i < banner.length; i++) {
            // + is used here for String concatenation (built-in operator overloading)
            banner[i] = o[i] + " " + o[i] + " " + p[i] + " " + s[i];
        }

        return banner;
    }

    // Prints any String[] pattern (enhanced for loop)
    public static void printPattern(String[] pattern) {
        for (String line : pattern) {
            System.out.println(line);
        }
    }

    public static void main(String[] args) {
        // Build and print the OOPS banner
        String[] oopsBanner = buildPattern();
        printPattern(oopsBanner);
    }
}
