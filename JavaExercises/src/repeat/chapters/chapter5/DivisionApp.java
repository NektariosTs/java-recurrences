package repeat.chapters.chapter5;

import java.util.Scanner;

/**
 * double demo
 */
public class DivisionApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double num1;
        double num2;
        double div = 0d;
        double mod = 0.0;
        float myFloat = 4.3F;

        System.out.println("insert two doubles");
        num1 = scanner.nextDouble();
        num2 = scanner.nextDouble();

        div = num1 / num2;
        mod = num1 % num2;

        System.out.printf("Div: %.2f\n", div);
        System.out.printf("Mod: %.2f", mod);
    }
}
