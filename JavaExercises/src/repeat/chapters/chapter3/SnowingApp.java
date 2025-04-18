package repeat.chapters.chapter3;


import java.util.Scanner;

public class SnowingApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean isRaining = false;
        boolean isSnowing = false;
        int temp = 0;

        System.out.println("insert if its raining");
        isRaining = scanner.nextBoolean();

        System.out.println("insert temp");
        temp = scanner.nextInt();

        isSnowing = isRaining && temp < 0;

        System.out.println("Is snowing: "+ isSnowing);
    }
}
