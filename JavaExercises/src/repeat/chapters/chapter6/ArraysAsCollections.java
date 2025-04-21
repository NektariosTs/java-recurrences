package repeat.chapters.chapter6;

import java.util.Arrays;

public class ArraysAsCollections {
    public static void main(String[] args) {
        int[] arr = {1, 5, 7, 9};

        int[] doubleMapped;
        doubleMapped = mapToDouble(arr);
        System.out.println(Arrays.toString(doubleMapped));

    }

    //filtering
    public static int[] getEvens(int[] arr) {
        int count = 0;

        for (int el : arr) {
            if (el % 2 == 0) count++;
        }

        int[] evens = new int[count];

        int pivot = 0;
        for (int el : arr) {
            if (el % 2 == 0) {
                evens[pivot] = el;
                pivot++;
            }
        }
        return evens;
    }

    //mapping
    public static int[] mapToDouble(int[] arr) {
        int[] mapped = new int[arr.length];

        for (int i = 0; i < arr.length; i++) {
            mapped[i] = arr[i] * 2;
        }
        return mapped;
    }

    //reducing
    public static int sum(int[] arr) {

        int total = 0;
        for (int el : arr) {
            total += el;
        }
        return total;
    }

    public static double avg(int[] arr) {
//        double average = 0;
//
//        for (int el : arr) {
//            average += el;
//        }
//        return average / arr.length;

        return sum(arr) / (double) arr.length;
    }
}
