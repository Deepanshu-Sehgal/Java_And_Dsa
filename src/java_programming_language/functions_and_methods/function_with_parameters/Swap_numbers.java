package java_programming_language.functions_and_methods.function_with_parameters;

public class Swap_numbers {
    public static void swap(int a, int b) {
        int temp = a;
        a = b;
        b = temp;
        System.out.println("A is : " + a);
        System.out.println("B is : " + b);
    }

    public static void main(String[] args) {
        int a = 5;
        int b = 10;
        swap(a, b);
    }
}
