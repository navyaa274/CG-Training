package Jan30;
import java.io.*;
import java.util.*;

public class Question5 {

    //Use FileReader to read a text file line by line and print each line to the console.
    public static void fileReader(String filePath) {
        try (FileReader fr = new FileReader(filePath);
             BufferedReader br = new BufferedReader(fr)) {

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
        fileReader(path);
        sc.close();
    }
}
