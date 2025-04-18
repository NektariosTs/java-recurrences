package repeat.chapters.chapter4;

import java.util.Scanner;

public class FlexibleFor {
    public static void main(String[] args) {
        int startValue = 0;
        int endValue = 0;
        int step;
        Scanner scanner = new Scanner(System.in);
        int iterations = 0;

        System.out.println("please enter start, end, step");
        startValue = scanner.nextInt();
        endValue = scanner.nextInt();
        step = scanner.nextInt();

        for (int i = startValue; i <= endValue; i += step) {
            iterations++;
            System.out.println(i + " ");
        }
        System.out.println();
        System.out.println("Iterations: " + iterations);
    }
}
