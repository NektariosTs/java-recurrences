package repeat.chapters.chapter7;

/*
* ta strings einai immutable kai den epireazei to antigrafo
* anaforas.opote exoume egkuro copy me antigrafh ths anaforas*/
public class StrCopy {

    public static void main(String[] args) {
        String s1 = "Athens";
        String s2 = s1;
        System.out.println(s2);
    }
}
