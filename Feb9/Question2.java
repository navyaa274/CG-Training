package Feb9;
import java.util.*;
import java.io.*;

public class Question2 {
    public static void main(String[] args) {
        String filePath = "D:\\Capgemini-Training Codes\\Feb9\\employees.csv";
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filePath, true))) {
            writer.write("106,Neha Patel,Operations,55000\n");
            writer.write("107,Sanjay Rao,Sales,58000\n");
            writer.write("108,Kiran Das,IT,72000\n");
            writer.write("109,Sneha Nair,HR,54000\n");
            writer.write("110,Mohit Jain,Finance,69000\n");
            System.out.println("CSV file written successfully!");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}