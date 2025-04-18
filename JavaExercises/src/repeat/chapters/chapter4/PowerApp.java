package repeat.chapters.chapter4;

/**
 * calculates a^n
 */
public class PowerApp {
    public static void main(String[] args) {
        int base = 2;
        int power = 10;
        int result = 1;

        for (int i = 1; i <= power; i++) {
            result *= base;
            System.out.println(result);
        }

        System.out.println("result: " + result);
    }
}
