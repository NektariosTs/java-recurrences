package repeat.chapters.chapter7;

public class ImmutableStr {
    public static void main(String[] args) {
        String s1 = "Coding";
        String s2 = "Coding";

        s2 = "Factory"; // s1 remains unchangable
        s1 = "Athens";
    }
}
