package repeat.chapters.chapter5;

public class PowerAppRecursive {

    public static void main(String[] args) {
        power(2, 4);
        System.out.println(power(2, 4));
    }

    /**
     *  recursive version of power
     * @param a  the base
     * @param n  the power
     * @return   the base raised to the power.
     */
    public static long power(int a, int n) {
        if (n == 0) {
            return 1;
        }
        return power(a, n - 1) * a;

//        return (n == 0) ? 1 : power(a, n - 1) * a;
    }
}
