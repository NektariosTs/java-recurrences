package repeat.chapters.chapter3;

import java.util.Scanner;

/**
 * reverse number
 * 123 321
 */
public class ReverseNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = 0;
        int reversed = 0;
        int tempNum = 0;
        int rightDigit = 0;

        System.out.println("enter a number");
        number = scanner.nextInt();

        tempNum = number;
        while (tempNum > 0) {
            rightDigit = tempNum % 10;
            reversed = reversed * 10 + rightDigit;

            tempNum /= 10;
        }


        System.out.println("the reversed number is: " + reversed);
    }
}
