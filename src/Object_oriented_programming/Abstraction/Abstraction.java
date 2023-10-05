package Object_oriented_programming.Abstraction;

public class Abstraction {
    public static void main(String[] args) {
        Horse horse = new Horse();
        horse.eat();
        horse.walk();
        horse.changeColor();
        System.out.println(horse.color);

        Chicken chicken = new Chicken();
        chicken.eat();
        chicken.walk();
//        chicken.changeColor();
        System.out.println(chicken.color);
    }
}

abstract class Animal {
    String color;

    Animal() {
        color = "Brown";
    }

    void eat() {
        System.out.println("Animal eats");
    }

    abstract void walk();
}

class Horse extends Animal {
    void changeColor() {
        color = "DarkBrown";
    }

    void walk() {
        System.out.println("Walks on 4 legs");
    }
}

class Chicken extends Animal {
    void changeColor() {
        color = "Yellow";
    }
    void walk() {
        System.out.println("Walks on 2 legs");
    }
}
