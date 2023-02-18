package Object_oriented_programming.Abstraction;

public class Abstraction {
    public static void main(String[] args) {
        Horse horse = new Horse();
        horse.eat();
        horse.walk();
        Chicken chicken = new Chicken();
        chicken.walk();
        chicken.eat();
    }
}

abstract class Animal {
    void eat() {
        System.out.println("Animal eats");
    }

    abstract void walk();
}

class Horse extends Animal {
    void walk() {
        System.out.println("Walks on 4 legs");
    }
}

class Chicken extends Animal {
    void walk() {
        System.out.println("Walks on 2 legs");
    }
}
