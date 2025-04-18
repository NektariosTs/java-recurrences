package repeat.chapters.chapter2;

import java.util.Scanner;

/**
 * calculates the price with vat.
 */
public class PriceWithVat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final double VAT = 0.24;
        double priceWithVat = 0.0;
        double inputPrice = 0.0;
        double vat = 0.0;

        System.out.println("insert the price");
        inputPrice = scanner.nextDouble();


        inputPrice = (inputPrice * VAT) + inputPrice;

        vat = inputPrice * VAT;
        //kai me auton ton tropo an theloume na prosthesoume kai t vat
        priceWithVat = inputPrice + vat;

        System.out.println("the price is: " + inputPrice);
        System.out.printf("Price: %f, vat: %f, price with vat: %f", inputPrice, vat, priceWithVat);
    }
}
