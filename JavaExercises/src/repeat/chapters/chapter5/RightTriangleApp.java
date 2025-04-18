package repeat.chapters.chapter5;

import java.util.Scanner;

/**
 * checks if a triangle is right
 */
public class RightTriangleApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double a;
        double b;
        double c;
        final double EPSILON = 0.000005;

        System.out.println("please a, b, c");
        b = scanner.nextDouble();
        c = scanner.nextDouble();
        a = scanner.nextDouble();

        if (Math.abs(a*a - b*b - c*c) <= EPSILON) {
            System.out.println("triangle is right");
        }else {
            System.out.println("triangle is not right");
        }
    }
}
