package Object_oriented_programming.Interface;

public class Nested_Static_class {
    public static void main(String[] args) {
        Student student1 = new Student();
        Student.schoolName = "Dav";

        Student student2 = new Student();
        System.out.println(Student.schoolName);

    }
}

class Student {
    String name;
    String roll;
    static String schoolName;

    static int returnPercentage(int math, int phy, int chem) {
        return (math + phy + chem) / 3;
    }

    String getName() {
        return this.name;
    }

    void setName(String name) {
        this.name = name;
    }

    static class Name {

    }
}
