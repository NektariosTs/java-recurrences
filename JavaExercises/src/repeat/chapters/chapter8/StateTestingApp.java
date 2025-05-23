package repeat.chapters.chapter8;

import java.util.Scanner;

public class StateTestingApp {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int numerator = 0;
        int denominator = 0;
        int result = 0;


        System.out.println("please insert numerator");
        while (!in.hasNext()) {//state-test
            System.out.println("Error. Input must me int. please insert numerator");
            in.nextLine();
        }
        numerator = in.nextInt();

        System.out.println("please insert denominator");
        while (!in.hasNext()) {
            System.out.println("Error. Input must me int. please insert denominator");
            in.nextLine();
        }
        denominator = in.nextInt();

        if (denominator == 0) { //state-test
            System.out.println("Error.Denominator must not be zero");
            System.exit(1);
        }

        result = numerator / denominator;
        System.out.printf("%d / %d = %d\n", numerator, denominator, result);
    }
}
