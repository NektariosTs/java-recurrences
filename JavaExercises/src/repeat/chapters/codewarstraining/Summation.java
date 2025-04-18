package repeat.chapters.codewarstraining;

import java.util.Scanner;

public class Summation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = 0;
        int i = 1;
        int sum = 0;

        System.out.println("insert a nmber");
        number = scanner.nextInt();

        while (i <= number){
             sum += number;
            i++;
            System.out.println(sum);
        }

    }


}
