package repeat.chapters.chapter3;

import java.util.Scanner;

public class SpecialWhileTypes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int i = 1;
        int num;

        while((num = scanner.nextInt()) >= 0);

        while (i <= 0) {
            System.out.println("Never gets in");
            i++;
        }

        while (i < 1) {
            System.out.println("never gets in");
            i++;
        }

        while (i <= 1) {
            System.out.println("one time gets in");
            i++;
        }

        while (true) {
            System.out.println("eternal loop");
        }
    }
}
