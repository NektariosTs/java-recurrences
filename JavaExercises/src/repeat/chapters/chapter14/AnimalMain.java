package repeat.chapters.chapter14;

public class AnimalMain {

    public static void main(String[] args) {
        Dog dog = new Dog("tommy", 5, "Golden Retriever");
        dog.makeSound();
        dog.searchForFood();

        doMakeSound(dog);
    }

    public static void doMakeSound(Animal animal) {
        animal.makeSound();
    }
}
