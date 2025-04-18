package repeat.chapters.chapter3;

import java.util.Scanner;

/**
 * turn lights on, if its raining AND car is running > 100 OR is dark
 */
public class LightsOn {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean isLightsOn = false;
        boolean isRaining = false;
        boolean isRunning = false;
        boolean isDark = false;
        int speed = 0;

        System.out.println("insert if its raining");
        isRaining = scanner.nextBoolean();

        System.out.println("insert if its dark");
        isDark = scanner.nextBoolean();

        System.out.println("insert the speed");
        speed = scanner.nextInt();

        isLightsOn = isRaining && speed > 100 || isDark;

        System.out.println("lights on: " + isLightsOn);
    }
}
