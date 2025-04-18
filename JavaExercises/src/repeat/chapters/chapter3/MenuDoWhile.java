package repeat.chapters.chapter3;

import java.util.Scanner;

/**
 * show a menu at least one.
 * opwsdhpote me thn do while prepei na ektelestei mia fora.prepei na mpei mesa sto swma ths mia fora.
 */
public class MenuDoWhile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;


        do {
            System.out.println("please select one of the following: ");
            System.out.println("1. Insert");
            System.out.println("2. Delete");
            System.out.println("3, Quit");
            choice = scanner.nextInt();
        } while (choice != 3);

        System.out.println("thanks for using the Menu app");
    }

}


