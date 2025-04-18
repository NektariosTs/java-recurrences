package repeat.chapters.chapter3;

import java.util.Scanner;

/**
 * calculates n
 */
public class Factorial {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int inputNum = 0;
        int facto = 1;
        int i = 1;

        System.out.println("insert input num");
        inputNum = scanner.nextInt();

        while (i <= inputNum) {
            facto *= i;
            i++;
            System.out.println(facto);
        }


        System.out.println("factorial: " + facto);

    }
}
