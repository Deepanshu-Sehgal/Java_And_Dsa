package Object_oriented_programming.Inheritance;

public class Hierarchial_inheritance {
    public static void main(String[] args) {
        Mammals mammel = new Mammals();
        Fish1 fish = new Fish1();
        mammel.eat();
        mammel.breathe();
        mammel.walk = "true";
        fish.swim = "true";
        mammel.walk = "true";
    }
}

class Animals1 {
    String color;

    void eat() {
        System.out.println("eat");
    }

    void breathe() {
        System.out.println("Breathes");
    }
}

class Fish1 extends Animal {
    String swim;
}

class Bird extends Animal {
    String fly;
}

class Mammals extends Animal {
    String walk;
}


