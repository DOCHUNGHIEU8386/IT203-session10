abstract class Animal {

    protected String name;

    public Animal(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}

interface Swimmable {
    void swim();
}

interface Flyable {
    void fly();
}

class Duck extends Animal implements Swimmable, Flyable {

    public Duck(String name) {
        super(name);
    }

    @Override
    public void swim() {
        System.out.println(name + " đang bơi dưới nước");
    }

    @Override
    public void fly() {
        System.out.println(name + " đang bay trên trời");
    }
}

class Fish extends Animal implements Swimmable {

    public Fish(String name) {
        super(name);
    }

    @Override
    public void swim() {
        System.out.println(name + " đang bơi dưới nước");
    }
}

public class Main {

    public static void main(String[] args) {

        Duck duck = new Duck("Vịt Donald");
        Fish fish = new Fish("Cá Nemo");

        System.out.println("=== Duck ===");
        duck.swim();
        duck.fly();

        System.out.println("\n=== Fish ===");
        fish.swim();

        // fish.fly(); //  Lỗi vì Fish không implement Flyable
    }
}
