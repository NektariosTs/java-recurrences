package repeat.chapters.chapter3;

import java.util.Scanner;

/**
 * calculates the positives
 */
public class Sentinel {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int positivesCount = 0;
        int inputNum = 0;

        System.out.println("insert a num");
        inputNum = scanner.nextInt();

        while (inputNum >= 0) {
            System.out.println("insert a num");
            inputNum = scanner.nextInt();
            positivesCount++;
        }

        System.out.println("Positives count: " + positivesCount);

    }
}
