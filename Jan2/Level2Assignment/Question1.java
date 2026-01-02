package Jan2.Level2Assignment;
import java.util.Scanner;

public class Question1 {
    public static void main(String[] args) {
        int num;

        Scanner scn = new Scanner(System.in);

        num = scn.nextInt();

        if(num <= 0){
            System.out.println("Not a natural number!");
        }
        else{
            for(int i = 1; i <= num; i++){
                if(i%2 == 0){
                    System.out.println(i + " Even");
                }
                else{
                    System.out.println(i + " Odd");
                }
            }

        }

        scn.close();
    }
}
