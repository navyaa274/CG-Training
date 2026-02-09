package Feb9;
import java.util.*;
import java.io.*;

public class Question4 {
    public static void main(String[] args) {
        String filePath = "D:\\Capgemini-Training Codes\\Feb9\\students.csv";
        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String line;
            int l = 1;
            System.out.println("Students with more than 80 marks");
            while ((line = br.readLine()) != null) {
                if(l > 1){
                    String[] columns = line.split(",");
                    int m = Integer.parseInt(columns[3]);
                    if(m > 80){
                        System.out.println(columns[1]);
                    }
                }
                l++;
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}