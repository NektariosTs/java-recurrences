package repeat.chapters.chapter7;

public class SplitStr {
    public static void main(String[] args) {
        String s = "Athens Uni      of Economics    and Business";

        String[] tokens = s.split("\\s+");

        for (String token : tokens) {
            System.out.print(token + " ");
        }
    }
}
