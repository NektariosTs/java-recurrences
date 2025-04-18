package repeat.chapters.chapter2;

import java.math.BigInteger;

/**
 * Big int demo
 */

public class BigIntApp {
    public static void main(String[] args) {
        BigInteger bigNum1 = new BigInteger("12312312312312313123123123123");
        BigInteger bigNum2 = new BigInteger("123123141452365411223254654235");
        BigInteger result;

        result = bigNum1.add(bigNum2);

        System.out.printf("%,d", result);
    }
}
