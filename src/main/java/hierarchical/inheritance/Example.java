package hierarchical.inheritance;

public class Example {
    public static void main(String[] args) {
        Cat cat = new Cat();
        cat.miau();
        cat.eat();

        Dog dog = new Dog();
        dog.bark();
        dog.eat();
    }
}
