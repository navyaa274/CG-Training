package Jan30;
import java.io.*;
import java.util.*;

public class Question7 {

    //Convert Byte Stream to Character Stream Using InputStreamReader
    public static void byteToChar(String filePath, String charsetName) {
        try (FileInputStream fis = new FileInputStream(filePath);
             InputStreamReader isr = new InputStreamReader(fis, charsetName);
             BufferedReader br = new BufferedReader(isr)) {

            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter file path: ");
        String path = sc.nextLine();
        System.out.print("Enter charset (e.g. UTF-8): ");
        String charset = sc.nextLine();
        byteToChar(path, charset);
        sc.close();
    }
}