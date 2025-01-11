package Object_oriented_programming.Inheritance;

public class Multi_level_inheritance {
    public static void main(String[] args) {
        Dogs dobby = new Dogs();
        dobby.eat();
        dobby.breathe();
        dobby.legs = 4;
        dobby.breed = "Pomarian";
    }
}

class Animals {
    String color;

    void eat() {
        System.out.println("eat");
    }

    void breathe() {
        System.out.println("Breathes");
    }
}

class Mammal extends Animal {
    int legs;
}

class Dogs extends Mammal {
    String breed;
}
