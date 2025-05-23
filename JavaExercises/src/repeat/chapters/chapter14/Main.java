package repeat.chapters.chapter14;

import repeat.chapters.chapter14.model.Point;
import repeat.chapters.chapter14.model.Teacher;
import repeat.chapters.chapter14.services.CodingFactorySingleton;
import repeat.chapters.chapter14.services.HelloUtil;

public class Main {

    public static void main(String[] args) {
        Teacher teacher1 = new Teacher(1, "Ath.", "Androutsos");
        Teacher teacher2 = new Teacher(2, "A.", "giannoutsou");
        Teacher teacher3 = new Teacher(3, "C.", "Papadopoulos");

        HelloUtil.sayHello();

        Point p1 = Point.getInstance();
        Point p2 = Point.getRandomPoint();

        System.out.println(p1);
        System.out.println(p2);

        CodingFactorySingleton cf1 = CodingFactorySingleton.getInstance();
        CodingFactorySingleton cf2 = CodingFactorySingleton.getInstance();

        System.out.println(cf1);
        System.out.println(cf2);
    }
}
