package Object_oriented_programming.Interface;

public class Super_keyword {
    public static void main(String[] args) {
        Horse h = new Horse();
    }
}

class Animal5{
    Animal5(){
        System.out.println("animal constructor is called");
    }
}

class Horse extends Animal5{
    Horse(){
        super();
        System.out.println("Horse constructor is called");
    }
}
