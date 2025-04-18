package repeat.chapters.chapter3;

import java.util.Scanner;

/**
 * SEcret pou einai integer kai o xrhsths me mia mono prospatheia prepei na to vrei
 */
public class SecretFinder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = 0;
        final int SECRET = 12;

        System.out.println("insert to guess the secret");
        num = scanner.nextInt();

        if (num == SECRET) {
            System.out.println("Found");
        } else {
            System.out.println("Failure.");
        }
    }
}
