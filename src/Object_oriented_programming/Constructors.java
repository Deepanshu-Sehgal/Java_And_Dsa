package Object_oriented_programming;

public class Constructors {
    public static void main(String[] args) {
        Student1 s1 = new Student1();

    }
}

class Student1 {
    String name;
    int rollNo;

    Student1() {
        System.out.println("Constructor is called...");
    }
}
