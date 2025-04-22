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

    public static boolean anyEven(int[] arr) {
        boolean isAnyEven = false;

        for (int el : arr) {
            if (el % 2 == 0) {
                isAnyEven = true;
                break;
            }

        }
        return isAnyEven;


//        for (int el : arr) {
//            if (el % 2 == 0) {
//                return true;
//            }
//        }
//        return false;
    }

    public static boolean moreThanTwoEvens(int[] arr) {
        boolean isMoreThanTwoEvens = false;
        int count = 0;

        for (int el : arr) {
            if (el % 2 == 0)
                count++;
        }

        return count > 2;

//        return getEvens(arr).length > 2; to pairnoume ap  tous evens panw
    }

    public static boolean moreThanTwoConsecutive(int[] arr) {
        int count = 0;

        for (int i = 0; i < arr.length - 2; i++) {
            if (arr[i] == arr[i + 1] - 1 && arr[i] == arr[i + 2] - 2) {
                count++;
                break;
            }
        }
        return count >= 1;
    }

    public static boolean moreThanTwoWithSameEnding(int[] arr) {
        int[] endings = new int[10];
        boolean isSameEnding = false;

        for (int num : arr) {
            endings[num % 10]++;
        }
//        for (int i = 0; i < arr.length; i++) {
//            endings[arr[i] % 10]++;
//        }

        for (int count : endings) {
            if (count >= 3) {
                isSameEnding = true;
                break;
            }
        }
        return isSameEnding;
    }

    public static boolean AllAreEven(int[] arr) {
//        return getEvens(arr).length == arr.length;
        boolean allEven = false;
        int count = 0;

        for (int el : arr) {
            if (el % 2 == 0) count++;
        }
        return count == arr.length;
    }
}
