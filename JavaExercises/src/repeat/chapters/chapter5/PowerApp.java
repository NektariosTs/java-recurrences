package repeat.chapters.chapter5;

public class PowerApp {

    public static void main(String[] args) {

        for (int b = 1, p = 1; b <= 10; b++, p++) {
            System.out.printf("%,d\n", pow(b, p));
        }

//        long pow = pow(2, 9);
//        System.out.println(pow);


    }


    /**
     * calculates a^n.
     *
     * @param a the base
     * @param n the power
     * @return the base raised to the power.
     */
    public static long pow(long a, long n) {
//        long result = 1;
//
//        for (int i = 1; i <= n; i++) {
//            result *= a;
//        }
        return (long) Math.pow(a, n);
    }
}
