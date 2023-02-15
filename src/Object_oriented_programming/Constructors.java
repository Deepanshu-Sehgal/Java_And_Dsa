package Object_oriented_programming;

public class Constructors {
    public static void main(String[] args) {
        Student1 s1 = new Student1();
        Student1 s2 = new Student1("Deepanshu");

    }
}

class Student1 {
    String name;
    int rollNo;

    //non parameterized constructor
    Student1() {
        System.out.println("Constructor is called...");
    }


    //parameterized conductor
    Student1(String name){
        this.name = name;
    }
}
