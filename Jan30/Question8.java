package Jan30;
import java.io.*;
import java.util.*;

public class Question8 {

    //Read User Input and Write to File Using InputStreamReader
    public static void readAndWrite(String outputFilePath) {
        try (InputStreamReader isr = new InputStreamReader(System.in);
             BufferedReader br = new BufferedReader(isr);
             FileWriter fw = new FileWriter(outputFilePath)) {

            System.out.println("Enter lines (type 'exit' to stop):");
            String line;
            while ((line = br.readLine()) != null) {
                if ("exit".equalsIgnoreCase(line)) {
                    break;
                }
                fw.write(line);
                fw.write(System.lineSeparator());
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter output file path: ");
        String path = sc.nextLine();
        readAndWrite(path);
        sc.close();
    }
}