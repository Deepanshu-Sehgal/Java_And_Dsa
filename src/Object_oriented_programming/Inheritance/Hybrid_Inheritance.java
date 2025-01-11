package Object_oriented_programming.Inheritance;

public class Hybrid_Inheritance {
    public static void main(String[] args) {

    }
}

class Animals2 {
    String color;

    void eat() {
        System.out.println("eat");
    }

    void breathe() {
        System.out.println("Breathes");
    }
}

class Fish2 extends Animals2 {
    String swim;
}

class Tuna extends Fish2 {
    void print() {
        System.out.println(swim);
    }
}

class Shark extends Fish2 {
    void print() {
        System.out.println(swim);
    }
}

class Bird2 extends Animals2 {
    String fly;
}

class Mammals2 extends Animals2 {
    String walk;
}

class Dogs1 extends Mammals {
    void print() {
        System.out.println(walk);
    }
}

class Cat extends Mammals {
    void print() {
        System.out.println(walk);
    }
}

class Human extends Mammals {
    void print() {
        System.out.println(walk);
    }
}
