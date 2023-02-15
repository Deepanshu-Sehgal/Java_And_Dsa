package Object_oriented_programming;

public class Copy_constructor {
    public static void main(String[] args) {
        Student2 s1 = new Student2();
        s1.name = "Deep";
        s1.rollNo = 123;
        s1.password = "SDe546";

        Student2 s2 = new Student2(s1);
        s2.password = "Xyz";

    }
}

class Student2 {
    String name;
    int rollNo;
    String password;

    //copy constructor
    Student2(Student2 s2) {
        this.name = s2.name;
        this.rollNo = s2.rollNo;
    }

    //non parameterized constructor
    Student2() {
        System.out.println("Constructor is called...");
    }


    //parameterized conductor
    Student2(String name) {
        this.name = name;
    }
}
