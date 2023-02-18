package Object_oriented_programming.Polymorphism;


//Function Overloading -same function with different parameters
public class Method_overloading {
    public static void main(String[] args) {
        Calculator cal = new Calculator();
        System.out.println(cal.sum(5, 5, 6));
        System.out.println(cal.sum(5.21f, 5.3f, 6.5f));
    }

}

class Calculator {
    int sum(int a, int b) {
        return a + b;
    }

    int sum(int a, int b, int c) {
        return a + b + c;
    }

    float sum(float a, float b, float c) {
        return a + b + c;
    }
}
