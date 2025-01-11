package Object_oriented_programming.Interface;

public class Super_keyword {
    public static void main(String[] args) {
        Animal5 h = new Horse();
        h.print();
        Animal5 h2 = new Animal5();
        h2.print();
    }
}

class Animal5 {
    Animal5() {
        System.out.println("animal constructor is called");
    }

    void print() {
        System.out.println("Animal");
    }
}

class Horse extends Animal5 {
    Horse() {
        super();
        System.out.println("Horse constructor is called");
    }

    void print() {
        System.out.println("Horse");
    }
}
