package java_programming_language.functions_and_methods.function_with_parameters;

public class Factorial_of_n {
    public static int factorial(int n) {
        int f = 1;
        for (int i = 1; i <= n; i++) {
            f *= i;
        }
        return f;
    }

    public static void main(String[] args) {
        int f = 5;
        System.out.println(factorial(f));

    }
}
