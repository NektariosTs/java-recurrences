package repeat.chapters.chapter2;

import java.util.Scanner;
import java.util.Set;

/**
 * metatrepei hmeres, wres, lepta, deuter,
 * se sunolika deuter.
 */
public class DateTimeToSecondsConverter {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        final int SECONDS_PER_DAY = 3600 * 24;
        final int SECONDS_PER_HOUR = 3600;
        final int SECONDS_PER_MINUTES = 60;

        int inputDays;
        int inputHours;
        int inputMinutes;
        int inputSeconds;
        int totalSeconds = 0;

        System.out.println("insert days, hours, minutes, seconds");
        inputDays = scanner.nextInt();
        inputHours = scanner.nextInt();
        inputMinutes = scanner.nextInt();
        inputSeconds = scanner.nextInt();

        totalSeconds = inputDays * SECONDS_PER_DAY + inputHours * SECONDS_PER_HOUR +
                inputMinutes * SECONDS_PER_MINUTES + inputSeconds;

        System.out.printf("total seconds is: %,d ", totalSeconds);

    }
}
