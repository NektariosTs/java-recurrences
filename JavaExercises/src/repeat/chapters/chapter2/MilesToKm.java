package repeat.chapters.chapter2;

import java.util.Scanner;

public class MilesToKm {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final double KM_PER_MILE = 1.6;
        double miles = 0.0;
        double km = 0.0;

        System.out.println("insert km");
        miles = scanner.nextDouble();
        km = KM_PER_MILE * miles;

        System.out.println("miles is: " + miles + " km is: " + km);


    }
}
