package repeat.chapters.chapter3;

import java.util.Scanner;

/**
 * metrame mono tous evens kai tous prosthetoume
 */
public class SumOfEvens {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = 0;
        int i = 2;
        int sum = 0;

        System.out.println("insert a number");
        number = scanner.nextInt();

        while (i <= number) {
            sum += i;
            i += 2;
            System.out.println(sum);
        }
        System.out.println("sum: " + sum);


    }
}

