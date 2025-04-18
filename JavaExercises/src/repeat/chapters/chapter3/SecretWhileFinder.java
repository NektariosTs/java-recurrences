package repeat.chapters.chapter3;

import java.util.Scanner;

public class SecretWhileFinder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = 0;
        final int SECRET = 12;
        boolean isSuccess = false;

        do {
            System.out.println("insert to guess the secret");
            num = scanner.nextInt();

            if (num == SECRET) {
                System.out.println("Found");
                isSuccess = true;
            } else {
                System.out.println("Try again.");
            }
        } while (!isSuccess);
    }
}
