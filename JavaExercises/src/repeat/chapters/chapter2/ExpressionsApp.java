package repeat.chapters.chapter2;

public class ExpressionsApp {

    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 20;
        int sum = 0;
        int sub = 0;
        int mul = 0;
        int div = 0;
        int mod = 0;

        int result1 = 0;
        int result2 = 0;

        sum = num1 + num2;
        sub = num1 - num2;
        mul = num1 * num2;
        div = num1 / num2;

        num1++;
        result1 = num1++; //estw num1 = 8, tote to result1 = 8, kai to num1 = 9
        result2 = ++num2; //estw num2 = 8, tote to result2 = 9, kai to num2 = 9

        System.out.println(result1);
        System.out.println(result2);

    }
}