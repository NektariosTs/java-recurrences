package repeat.chapters.chapter6;

public class ArrayMinMax2 {

    public static void main(String[] args) {

    }

    public static int getMinPosition(int[] array) {
        if (array == null || array.length < 1) return -1;

        int minPosition = 0;
        int minValue = Integer.MAX_VALUE;

        for (int i = 0; i < array.length; i++) {
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
        int maxValue = Integer.MIN_VALUE;

        for (int i = 0; i < array.length; i++) {
            if (array[i] > maxValue) {
                maxPosition = i;
                maxValue = array[i];
            }
        }
        return maxPosition;
    }
}
