package repeat.chapters.chapter2;

/**
 * X = 10
 * Y = 85
 * D = 30
 * <p>
 * Jumps = 3
 */
public class FrogJumpsApp {
    public static void main(String[] args) {
        int target = 85;
        int start = 10;
        int hop = 30;
        int jumps = 0;


        //calculates jumps
//        jumps = (start * hop) / target;
//        jumps = (target - start) / hop;
//        jumps = (start + hop) / target;
        jumps = (int) Math.ceil((target - start) / (double) hop);

        System.out.println("Jumps: " + jumps);
    }
}
