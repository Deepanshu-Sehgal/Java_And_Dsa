package Object_oriented_programming.Polymorphism;

public class Method_overriding {

    public static void main(String[] args) {
        Dear dear = new Dear();
        dear.eat();

    }
}

class Janwar{
    void eat(){
        System.out.println("Eats anything");
    }
}

class Dear extends Janwar{
    @Override
    void eat() {
        System.out.println("Eats grass");
    }
}
