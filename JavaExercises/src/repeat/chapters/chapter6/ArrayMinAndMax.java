package repeat.chapters.chapter6;

/*
 * finds the min and max of an array*/
public class ArrayMinAndMax {
    public static void main(String[] args) {

        int[] arr = {9, 3, 4, 511, 6, 7, 75};
        int minValue;
        int maxValue;
        minValue = getMinPosition(arr);
        maxValue = getMaxPosition(arr);

        System.out.println("min Value: " + minValue);
        System.out.println("max Value: " + maxValue);

    }

    public static int getMinPosition(int[] array) {
        if (array == null || array.length < 1) return -1;

        int minPosition = 0;
        int minValue = array[minPosition];

        for (int i = 1; i < array.length; i++) {
            if (array[i] < minValue) {
                minPosition = i;
                minValue = array[i];
            }
        }
        return minPosition;
    }

    public static int getMaxPosition(int[] array) {
        if (array == null || array.length < 1) return -1;

        int maxPosition = 0;
        int maxValue = array[maxPosition];

        for (int i = 0; i < array.length; i++) {
            if (array[i] > maxValue) {
                maxPosition = i;
                maxValue = array[i];
            }
        }
        return maxPosition;
    }

    /**
     * Overloaded.
     *
     * @param arr
     * @param low
     * @param high
     * @return
     */
    public static int getMinPosition(int[] arr, int low, int high) {
        if (arr == null || arr.length < 1) return -1;
        if (low < 0 || high > arr.length - 1) return -1;
        if (low > high) return -1;

        int minPosition = low;
        int minValue = arr[low];

        for (int i = 0; i < high; i++) {
            if (arr[i] > low) {
                minPosition = i;
                minValue = arr[i];
            } else {
                return high;
            }
        }
        return minPosition;
    }
}
