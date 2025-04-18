package repeat.chapters.chapter3;

import java.util.Scanner;

/**
 * demo ternary
 */
public class ternaryOperator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num;
        int abs = 0;

        System.out.println("enter num");
        num = scanner.nextInt();

        if (num >= 0) abs = num;
        else abs = -num;

        //ternary operator
        abs = (num >= 0) ? num : -num;// exei mia sunthikh boolean mesa kai an einai(?) true kane kati alliws(else :) kati allo

        System.out.println("abs: " + abs);
    }


}
