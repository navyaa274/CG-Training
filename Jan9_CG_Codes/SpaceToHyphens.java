package Jan9_CG_Codes;
import java.util.Scanner;

/*
Q13: Replace spaces with hyphens in a string
*/

public class SpaceToHyphens {
    public static void main(String[] args) {
        Scanner  scn = new Scanner(System.in);

        String s = scn.nextLine();
        StringBuilder sb = new StringBuilder();

        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) == ' '){
                sb.append('-');
            }
            else {
                sb.append(s.charAt(i));
            }
        }

        System.out.println(sb);
        scn.close();
    }
}
