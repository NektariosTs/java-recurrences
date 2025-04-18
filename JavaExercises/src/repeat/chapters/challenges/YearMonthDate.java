package repeat.chapters.challenges;

import java.util.Scanner;

public class YearMonthDate {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int year = 0;
        int month = 0;
        int date = 0;
        int formatedYear = 0;

        System.out.println("please insert year, month,date");
        date = scanner.nextInt();
        month = scanner.nextInt();
        year = scanner.nextInt();
        formatedYear = year % 100;

        System.out.printf(" %02d/%02d/%2d",date, month, formatedYear);
    }
}
