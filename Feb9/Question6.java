package Feb9;
import java.io.*;
import java.util.*;

public class Question6 {
    public static void main(String[] args) {
        String inputPath  = "D:/Capgemini-Training Codes/Feb9/employees.csv";
        String outputPath = "D:/Capgemini-Training Codes/Feb9/employees_updated.csv";

        List<String> lines = new ArrayList<>();

        try (BufferedReader br = new BufferedReader(new FileReader(inputPath))) {
            String line;
            int l = 1;
            while ((line = br.readLine()) != null) {

                if(l > 1){
                    String[] columns = line.split(",");
                    String department = columns[2].trim();
                    double salary = Double.parseDouble(columns[3].trim());

                    if (department.equalsIgnoreCase("IT")) {
                        salary = salary * 1.10;
                    }

                    String updatedLine = columns[0] + "," +
                            columns[1] + "," +
                            columns[2] + "," +
                            String.format("%.2f", salary);
                    lines.add(updatedLine);
                }
                else{
                    lines.add(line);
                }
                l++;
            }

        }
        catch (IOException e) {
            e.printStackTrace();
        }

        try (BufferedWriter bw = new BufferedWriter(new FileWriter(outputPath))) {
            for (String l : lines) {
                bw.write(l);
                bw.newLine();
            }
            System.out.println("Updated CSV written to: " + outputPath);
        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }
}