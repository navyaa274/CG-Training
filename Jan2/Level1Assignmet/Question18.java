package Jan2.Level1Assignmet;
import java.util.*;

public class Question18 {
    public static void main(String[] args) {
        int num;

        Scanner scn = new Scanner(System.in);

        num = scn.nextInt();

        for(int i = 6; i <= 9; i++){
            System.out.println(num + " x " + i + " = " + (num * i));
        }

        scn.close();
    }
}
