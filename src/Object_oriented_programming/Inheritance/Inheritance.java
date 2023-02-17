package Object_oriented_programming.Inheritance;

public class Inheritance {
    public static void main(String[] args) {
        Fish fish = new Fish();
        fish.color = "Grey";
        fish.eat();
        fish.breathe();
        fish.fins = 2;
        fish.swim();

    }
}

//Base class
class Animal {
    String color;

    void eat() {
        System.out.println("eat");
    }

    void breathe() {
        System.out.println("Breathes");
    }
}

//Derived class
class Fish extends Animal {
    int fins;

    void swim() {
        System.out.println("Swims in water");
    }
}