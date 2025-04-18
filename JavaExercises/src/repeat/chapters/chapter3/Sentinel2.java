package repeat.chapters.chapter3;

import java.util.Scanner;

public class Sentinel2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int positivesCount = 0;
        int inputNum = 0;

        System.out.println("insert a num");

//mporoume na valoume mesas sto expresion kateutheian to inputNum
        while ((inputNum = scanner.nextInt()) >= 0) {
            positivesCount++;
            System.out.println("insert a num");

        }

        System.out.println("Positives count: " + positivesCount);

    }
}
