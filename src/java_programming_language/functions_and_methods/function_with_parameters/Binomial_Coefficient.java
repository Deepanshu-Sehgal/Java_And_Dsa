package java_programming_language.functions_and_methods.function_with_parameters;

public class Binomial_Coefficient {
    public static int binomialCoefficient(int n, int r) {
        int fact = Factorial_of_n.factorial(n);
        int r_fact = Factorial_of_n.factorial(r);
        int nmr = Factorial_of_n.factorial(n - r);
        return fact / (r_fact * nmr);
    }

    public static void main(String[] args) {
        System.out.println(binomialCoefficient(5,2));
    }
}
