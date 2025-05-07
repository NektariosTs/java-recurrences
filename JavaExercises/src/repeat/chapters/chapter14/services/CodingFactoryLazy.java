package repeat.chapters.chapter14.services;

public class CodingFactoryLazy {
    private static CodingFactoryLazy INSTANCE = null;

    private CodingFactoryLazy() {

    }

    public static CodingFactoryLazy getInstance() {
        if (INSTANCE == null) {
            INSTANCE = new CodingFactoryLazy();
        }
        return INSTANCE;
    }

    public void sayHello() {
        System.out.println("Hello!!");
    }
}
