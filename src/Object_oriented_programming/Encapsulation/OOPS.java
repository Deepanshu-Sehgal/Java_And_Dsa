package Object_oriented_programming.Encapsulation;

public class OOPS {
    public static void main(String[] args) {

       /*
          object created of a pen class named pen1
          by this we are access all the properties
          and functions of pen class*/
        Pen pen1 = new Pen();
        pen1.setColor("Blue");
        pen1.setTip(5);
        System.out.println(pen1.color + " & " + pen1.tip);
    }
}


//Class Declaration
class Pen {
    //properties + functions
    String color; //attributes/properties of class
    int tip; //attributes/properties of class

    //function/method declaration
    void setColor(String newColor) {
        color = newColor;
    }

    //function/method declaration
    void setTip(int newTip) {
        tip = newTip;
    }
}

class Student {
    String name;
    int age;
    float percentage;

    void calcPercentage(int phy, int chem, int math) {
        percentage = (phy + chem + math) / 3;
    }
}
