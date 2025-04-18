package repeat.chapters.chapter3;

import java.util.Scanner;

/**
 * calculates the sum of the digits of a number.
 */
public class CalculatesSumOfGivenNum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = 0;
        int sum = 0;
        int i = 1;
        System.out.println("enter a positive integer");
        number = scanner.nextInt();

        //todo Sum
        while (i <= number) {
            sum += i;
            i++;
            System.out.println(sum);
        }


        System.out.println("The sum of digits of " + number + " is " + sum);
    }
}
