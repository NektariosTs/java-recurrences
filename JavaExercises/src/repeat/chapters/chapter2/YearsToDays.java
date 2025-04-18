package repeat.chapters.chapter2;

import java.util.Scanner;

/**
 * years to days convert
 */

public class YearsToDays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final int DAYS_PER_YEAR = 365;
        int age = 0;
        int days = 0;

        System.out.println("insert the years that you want to convert in days");
        age = scanner.nextInt();
//        days = scanner.nextInt();

        days = age * DAYS_PER_YEAR;

        System.out.printf("the age: %d, and the days: %d ", age, days);
    }
}
