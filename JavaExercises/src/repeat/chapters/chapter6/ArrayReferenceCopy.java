package repeat.chapters.chapter6;

/*
 * copies the reference of the array
 * it is shallow copy, there are side effects
 * */
public class ArrayReferenceCopy {
    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4, 5};
        int[] arrRefCopy = arr;

        for (int el : arrRefCopy) {
            System.out.print(el + " ");
        }

//        for (int i = 0;i < arr.length; i++) {
//            System.out.println(arr[i]);
//        }

        arrRefCopy[4] = 100;

        for (int el : arr) {
            System.out.println(el + " ");
        }
    }
}
