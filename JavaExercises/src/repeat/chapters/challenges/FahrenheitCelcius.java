package repeat.chapters.challenges;

import java.util.Scanner;

public class FahrenheitCelcius {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int celsius;
        int fahrenheit;
        int temperature;

        System.out.println("please insert the tempreature that you want to convert");
//        temperature = scanner.nextInt();
        fahrenheit = scanner.nextInt();

        celsius = 5 * (fahrenheit - 32) / 9;
        System.out.printf("h fareneit thermokrasia einai %d, kai h celsious einai: %d ", fahrenheit, celsius);
    }
}
