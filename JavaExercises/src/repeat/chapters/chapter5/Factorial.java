package repeat.chapters.chapter5;

/*
* upologizei to paragontiko tou n.
* n! = 1 * 2 * 3 ... * n
* */
public class Factorial {
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            System.out.println(i + "! = " + facto(i));
        }
    }


    /**
     * Calculates n!.
     *
     * @param n the input number
     * @return  the factorial of n
     */
    public static int facto(int n) {
        int result = 1;

        for (int i = 1; i <= n; i++) {
            /*result = result * 1;*/
            result *= i;
        }
        return result;
    }
}
