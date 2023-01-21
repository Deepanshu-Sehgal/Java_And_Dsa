package java_programming_language.functions_and_methods.function_overloading;

public class Sum {

    //function to cal sum of 2 numbers
    public static int sum(int a, int b) {
        return a + b;
    }

    //function to cal sum of 3 numbers
    public static int sum(int a, int b, int c) {
        return a + b + c;
    }

    public static void main(String[] args) {
        System.out.println(sum(5, 6, 10));
    }
}
