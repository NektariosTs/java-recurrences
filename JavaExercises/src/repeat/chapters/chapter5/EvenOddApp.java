package repeat.chapters.chapter5;

import java.util.Scanner;

public class EvenOddApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num;

        System.out.println("insert a number");
        num = scanner.nextInt();

        System.out.println(num + " is even: " + isEven(num));
        System.out.println(num + " is even: " + isOdd(num));
    }

    public static boolean isEven(int num) {
        return num % 2 == 0;

//        if (num % 2 == 0) {
//            return true;
//        }
//        return false;
    }

    /**
     * delegation pattern,
     * xrhsimopoioume mia hdh uparxousa methodo (isEven)
     * @param num
     * @return
     */
    public static boolean isOdd(int num) {
        return !isEven(num);
//        return num % 2 != 0;
    }
}
