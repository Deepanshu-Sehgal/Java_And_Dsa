package java_programming_language.operators;

public class Unary_operator {
    public static void main(String[] args) {

        //Pre increment
        int a = 10;
        int b = ++a;
        System.out.println(a);
        System.out.println(b);

        //Post increment
        int c = 10;
        int d = c++;
        System.out.println(c);
        System.out.println(d);

        //Pre decrement
        int e = 10;
        int f = --e;
        System.out.println(e);
        System.out.println(f);

        //Post decrement
        int g = 10;
        int h = g--;
        System.out.println(g);
        System.out.println(h);
    }
}
