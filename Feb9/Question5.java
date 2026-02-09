package Feb9;
import java.util.*;
import java.io.*;

public class Question5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        String filePath = "D:\\Capgemini-Training Codes\\Feb9\\employees.csv";
        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String line;
            int l = 1;
            while ((line = br.readLine()) != null) {
                if(l > 1){
                    String[] columns = line.split(",");
                    if(name.equals(columns[1])){
                        System.out.println("Department: " + columns[2] + "\nSalary: " + columns[3]);
                    }
                }
                l++;
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}