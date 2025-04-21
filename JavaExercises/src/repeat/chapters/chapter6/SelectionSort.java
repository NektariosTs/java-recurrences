package repeat.chapters.chapter6;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4, 5, 2, 3, 515};
        int[] motion;

        motion = selectionSort(arr);
        System.out.println(Arrays.toString(motion));


    }

    public static int[] selectionSort(int[] arr) {

        for (int i = 0; i < arr.length - 1; i++) {

            //find min
            int minPosition = i;
            int minValue = arr[minPosition];

            for (int j = i; j < arr.length; j++) {
                if (arr[j] < minValue) {
                    minValue = arr[j];
                    minPosition = j;
                }
            }

            //Swap(minPos, i)
            swap(arr, minPosition, i);
        }
        return arr;
    }

    public static void swap(int[] arr, int i, int j) {
        int tmp = arr[i];
        arr[i] = arr[j];
        arr[j] = tmp;
    }
}
