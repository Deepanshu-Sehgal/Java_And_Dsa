package Object_oriented_programming.Interface;

public class Nested_Static_class {
    public static void main(String[] args) {
        Student student1 = new Student();
        student1.schoolName = "Dav";

        Student student2 = new Student();
        System.out.println(student2.schoolName);

    }
}

class Student {
    String name;
    String roll;
    static String schoolName;

    String getName() {
        return this.name;
    }

    void setName(String name) {
        this.name = name;
    }

    class Name{

    }
}
