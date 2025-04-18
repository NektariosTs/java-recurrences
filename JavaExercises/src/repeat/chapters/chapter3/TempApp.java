package repeat.chapters.chapter3;

import java.util.Scanner;

public class TempApp {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int temp = 0;
        boolean isTempBelowZero;

        System.out.println("insert temperature");
        temp = scanner.nextInt();

        isTempBelowZero = temp < 0;

        System.out.println("the temperature is below zero: " + isTempBelowZero);
    }
}
