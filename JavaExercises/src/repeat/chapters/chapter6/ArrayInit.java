package repeat.chapters.chapter6;

/*
 * dhlwsh arxikopoihsh tou pinaka
 * populate to pinaka
 * -new
 * -unsized init
 * -array initializer
 * -print stoixeia enos pinaka
 * */
public class ArrayInit {

    public static void main(String[] args) {
        int[] arr = new int[3];  // declaration
        int[] arr2 = {1, 2, 3, 4, 5};// unsize init
        int[] arr3 = new int[]{1, 2, 3, 4, 5};//array init

        //populate, dwsame times ston array
        arr[0] = 5;
        arr[1] = 10;
        arr[2] = 4;

        //traverse, diasxizoume ton pinaka
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

        //enhanced for
        for (int el : arr3) {
            System.out.print(el + " ");
        }

    }
}
