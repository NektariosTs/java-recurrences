package repeat.chapters.chapter2;


public class CounterApp {
    public static void main(String[] args) {
        int steps = 0;
        int distance = 3;

        System.out.printf("ta steps einai %d, distance einai %d\n ", steps++, distance--);
        System.out.printf("ta steps einai %d, distance einai %d\n ", steps++, distance--);
        System.out.printf("ta steps einai %d, distance einai %d\n ", steps++, distance--);
        System.out.printf("ta steps einai %d, distance einai %d\n ", steps, distance);
    }

}
