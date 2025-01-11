package Object_oriented_programming.Encapsulation;

public class Getters_and_Setters {
    public static void main(String[] args) {
        Pen2 p1 = new Pen2();
        p1.setColor("Blue");
        System.out.println(p1.getColor());

        p1.setTip(5);
        System.out.println(p1.getTip());
    }
}

class Pen2 {
    String color;
    int tip;

    String getColor() { //getting a value of color
        return this.color;
    }

    void setColor(String color) { //modifying the color value
        this.color = color;
    }

    int getTip() {
        return this.tip;
    }

    void setTip(int newTip) {
        tip = newTip;
    }
}
