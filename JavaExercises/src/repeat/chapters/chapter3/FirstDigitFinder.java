package repeat.chapters.chapter3;

import java.util.Scanner;

/**
 * finds the first digit of an integer
 */
public class FirstDigitFinder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = 0;
        int temporaryNum;


        System.out.println("enter a positive number");
        num = scanner.nextInt();

        temporaryNum = num;

        while (temporaryNum >= 10) {
           temporaryNum /= 10;
        }

        System.out.println("first digit: " + temporaryNum);
    }
}
