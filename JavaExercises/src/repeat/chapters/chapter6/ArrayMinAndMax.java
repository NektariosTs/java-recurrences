package repeat.chapters.chapter6;

/*
 * finds the min and max of an array*/
public class ArrayMinAndMax {
    public static void main(String[] args) {

    }

    public static int getMinPosition(int[] array) {
        if (array == null || array.length < 1) return -1;

        int minPosition = 0;
        int minValue = array[minPosition];

        for (int i = 0; i < array.length; i++) {
            if (array[i] < minValue) {
                minPosition = i;
                minValue = array[i];
            }
        }
        return minPosition;
    }
}
