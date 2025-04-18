package repeat.chapters.chapter3;

import java.util.Scanner;

/**
 * mas dinei thn propedia tou arithmou
 */
public class MultiplicationTable {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = 0;
        int i = 1;

        System.out.println("Enter an number");
        number = scanner.nextInt();

        while (i <= 10) {
            System.out.println(number + " * " + i + " = " + (i * number));
            i++;
        }

    }
}
