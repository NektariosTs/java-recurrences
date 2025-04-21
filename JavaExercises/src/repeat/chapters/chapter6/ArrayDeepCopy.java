package repeat.chapters.chapter6;

import java.util.Arrays;

/*
 * */
public class ArrayDeepCopy {

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int[] copied;

        copied = arrDeepCopy(arr);
        copied[0] = 100;
        System.out.println(copied[0]);
        System.out.println(arr[0]);

    }

    /*it creates a fresh-copy (deep copy) of an input array.*/
    public static int[] arrDeepCopy(int[] source) {

        int[] destination = new int[source.length];

        for (int i = 0; i < source.length; i++) {
            destination[i] = source[i];
//            System.arraycopy(source, 0, destination, 0, source.length);
//            destination = Arrays.copyOf(source, source.length);
//            destination = Arrays.copyOfRange(source, 0, source.length);

        }
        return destination;
    }
}
