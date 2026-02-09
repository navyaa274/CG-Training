package Feb9;
import java.util.*;
import java.io.*;

public class Question7 {
    public static void main(String[] args) {
        String filePath = "D:\\Capgemini-Training Codes\\Feb9\\employees.csv";
        Map<Integer, String> map = new TreeMap<>(Collections.reverseOrder());
        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String line;
            int l = 1;
            System.out.println("\t\t\tStudent Records");
            while ((line = br.readLine()) != null) {
                if(l > 1){
                    String[] columns = line.split(",");
                    map.put(Integer.parseInt(columns[3], columns[1]));
                }
                l++;
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        for(int i = 0; i<5; i++){
            System.out.println(map.);
        }
    }
}
