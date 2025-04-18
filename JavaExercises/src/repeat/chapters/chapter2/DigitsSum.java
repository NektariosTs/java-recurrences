package repeat.chapters.chapter2;


import java.util.Scanner;

public class DigitsSum {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num;
        int leftDigit = 0;
        int rightDigit = 0;
        int sum;

        System.out.println("insert a 2 digit number");
        num = scanner.nextInt();

        leftDigit = num / 10;
        rightDigit = num % 10;
        sum = leftDigit + rightDigit;


        System.out.println(sum);
        System.out.printf("to aristro pshfio %d, kai to deksi pshfio %d exoun apotelesma: %d",leftDigit,rightDigit,sum );
    }


}
