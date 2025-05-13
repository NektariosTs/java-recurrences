package repeat.chapters.chapter16.abstract_class;

public class Cat extends Animal {

   public Cat() {
       super();
   }

    @Override
    public String toString() {
        return getId() + ", " + getName();
    }

    @Override
    public void speak() {

    }

    @Override
    public void eat() {
        super.eat();
        System.out.println("... ate all her food");
    }
}
