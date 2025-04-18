package repeat.chapters.chapter5;

/*emfanizei ena menu epilogwn (prosthesh, afairesh)
 * o xrhsths epilegei
 * analoga me thn epilogh ekteleitai h antistoixh praksh.
 * kai ektupwnetai to apotelesma.
 * ekteleitai epanalipthka mexri o xrhsths na epileksei eksodos*/


import java.util.Scanner;

public class Calculator {
    static Scanner scanner = new Scanner(System.in);


    public static void main(String[] args) {
        int choice;
        int result = 0;


        while (true) {
            printMenu();
            choice = getOneInt();

            if (!isChoiceValid(choice)) {
                System.out.println("Error. Choice must be between 1-6.Try again.");
                continue;
            }

            if (choice == 6) {
                System.out.println("Eksodos");
                break;
            }

            result = getResultOnChoice(choice);
            System.out.println("Result " + result);

        }
    }

    public static void printMenu() {
        System.out.println("epilekste ena apo ta parakatw");
        System.out.println("1. prosthesh");
        System.out.println("2. afairesh");
        System.out.println("3. polaplasiasmos");
        System.out.println("4. diairesh");
        System.out.println("5. ypoloipo diareshs");
        System.out.println("6. eksodos");
    }

    public static int getOneInt() {
        return scanner.nextInt();
    }

    public static boolean isChoiceValid(int choice) {
//        if (choice >= 1 && choice <= 6) {
//            return true;
//        }else {
//            return false;
//        }

        return choice >= 1 && choice <= 6;
    }

    public static int getResultOnChoice(int choice) {
        int num1 = 0;
        int num2 = 0;
        int result = 0;
        System.out.println("parakalw eisagete 2 akeraies");
        num1 = getOneInt();
        num2 = getOneInt();

        switch (choice) {
            case 1:
                result = add(num1, num2);
                break;
            case 2:
                result = sub(num1, num2);
                break;
            case 3:
                result = mul(num1, num2);
                break;
            case 4:
                result = div(num1, num2);
                break;
            case 5:
                result = mod(num1, num2);
                break;
            default:
                System.out.println("error in choice");
                break;
        }
        return result;
    }

    public static int add(int a, int b) {
        return a + b;
    }
    public static int sub(int a, int b) {
        return a - b;
    }
    public static int mul(int a, int b) {
        return a * b;
    }
    public static int div(int a, int b) {
        if (b == 0) return 0;
        return a / b;
    }
    public static int mod(int a, int b) {
        if (b == 0) return 0;
        return a % b;
    }
}
