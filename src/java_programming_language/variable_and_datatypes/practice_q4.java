package java_programming_language.variable_and_datatypes;

public class practice_q4 {
    public static void main(String[] args) {
        byte b = 4;
        char c = 'a';
        short s = 512;
        int i = 1000;
        float f = 3.14f;
        double d = 99.9954;
        double result = (f * b) + (i % c) - (d * s);
        System.out.println(result);
        //the result variable will be of double type because of type conversion
    }
}
