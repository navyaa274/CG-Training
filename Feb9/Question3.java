package Feb9;
import java.util.*;
import java.io.*;

public class Question3 {
    public static void main(String[] args) {
        String filePath = "D:\\Capgemini-Training Codes\\Feb9\\students.csv";
        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String line;
            int l = 0;
            while ((line = br.readLine()) != null) {
                l++;
            }
            System.out.println("Number of Records: " + (l-1));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}