package repeat.chapters.chapter16.default_static;

public interface IWelcome {
    static void staticMethod() {
        System.out.println("Hello form interface static merhod");
    }



    default void defaultMethod() {
        System.out.println("Default method from IWelcome");
    }
}
