package repeat.chapters.chapter3;

import java.util.Scanner;

/**
 * upologizei to athroisma twn pshfiwn enos akeraiou.
 * p.x. 123 einai 6.
 */
public class SumOfDigits {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = 0;
        int sum = 0;
        int temporaryNum = 0;
        int rightDigit = 0;

        System.out.println("enter a positive integer");
        number = scanner.nextInt();

        //todo Sum

        temporaryNum = number;
        while (temporaryNum > 0) {
            rightDigit = temporaryNum % 10;
            sum += rightDigit;
            temporaryNum /= 10;
        }


        System.out.println("The sum of digits of " + number + " is " + sum);
    }
}

