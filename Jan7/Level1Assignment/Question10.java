package Jan7.Level1Assignment;
import java.util.Scanner;

/*
Q10: Write a program calculate the wind chill temperature given the temperature and wind speed
*/

public class Question10 {
    public static double calculateWindChill(double temperature, double windSpeed) {
        return 35.74 + 0.6215 * temperature + (0.4275 * temperature - 35.75) * Math.pow(windSpeed, 0.16);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double temp = sc.nextDouble();
        double speed = sc.nextDouble();

        System.out.println("Wind Chill Temperature: " + calculateWindChill(temp, speed));

        sc.close();
    }
}