package Feb9;
import java.util.*;
import java.io.*;

public class Question1 {
    public static void main(String[] args) {
        String filePath = "D:\\Capgemini-Training Codes\\Feb9\\students.csv";
        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String line;
            int l = 1;
            System.out.println("\t\t\tStudent Records");
            while ((line = br.readLine()) != null) {
                if(l > 1){
                    String[] columns = line.split(",");
                    System.out.println("ID: " + columns[0] + ", Name: " + columns[1] + ", Age: " + columns[2] + ", Marks: " + columns[3]);
                }
                    l++;
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}