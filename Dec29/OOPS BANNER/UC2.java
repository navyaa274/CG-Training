public class UC2 {
    public static void main(String[] args) {
        String[] bannerLines = new String[9];

        bannerLines[0] = "   ***       ***    ******       ***** ";
        bannerLines[1] = " **   **   **   **  **    **   **      ";
        bannerLines[2] = "**     ** **     ** **     ** **       ";
        bannerLines[3] = "**     ** **     ** **    **   **      ";
        bannerLines[4] = "**     ** **     ** ******       ***   ";
        bannerLines[5] = "**     ** **     ** **              ** ";
        bannerLines[6] = "**     ** **     ** **               **";
        bannerLines[7] = " **   **   **   **  **              ** ";
        bannerLines[8] = "   ***       ***    **         *****   ";

        // Using an enhanced for-each loop
        for (String line : bannerLines) {
            System.out.println(line);
        }


///////////////////extra prints for clarity///////////////////

        System.out.println(); // separator line

        // Using a standard for loop
        for (int i = 0; i < bannerLines.length; i++) {
            System.out.println(bannerLines[i]);
        }    

        // Using String.join
        String multiLineBanner = String.join("\n", bannerLines);
        System.out.println();
        System.out.println(multiLineBanner);
    }
}
