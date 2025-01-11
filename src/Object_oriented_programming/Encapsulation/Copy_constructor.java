package Object_oriented_programming.Encapsulation;

public class Copy_constructor {
    public static void main(String[] args) {
        Student2 s1 = new Student2();
        s1.name = "Deep";
        s1.rollNo = 123;
        s1.marks[0] = 100;
        s1.marks[1] = 90;
        s1.marks[2] = 80;

        Student2 s2 = new Student2(s1);//copy
        s1.marks[2] = 50;
        for (int i = 0; i < 3; i++) {
            System.out.println(s2.marks[i]);
        }


    }
}

class Student2 {
    String name;
    int rollNo;
    int[] marks;

  /*  //Shallow copy constructor - copy by reference only and changes reflect
    Student2(Student2 s2) {
        this.name = s2.name;
        this.rollNo = s2.rollNo;
        this.marks = s2.marks;
    }*/

    //Deep copy constructor - copy creating new array and changes don't reflect
    Student2(Student2 s2) {
        marks = new int[3];
        this.name = s2.name;
        this.rollNo = s2.rollNo;
        System.arraycopy(s2.marks, 0, this.marks, 0, marks.length);
    }


    //non parameterized constructor
    Student2() {
        marks = new int[3];
        System.out.println("Constructor is called...");
    }


    //parameterized conductor
    Student2(String name) {
        this.name = name;
    }
}
