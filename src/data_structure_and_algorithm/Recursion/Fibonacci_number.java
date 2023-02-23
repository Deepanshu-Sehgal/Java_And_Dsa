package data_structure_and_algorithm.Recursion;

public class Fibonacci_number {
    public static void main(String[] args) {
        System.out.println(printFibo(5));
    }

    public static int printFibo(int n) {
        if (n == 0 || n == 1) {
            return n;
        }
        int fib1 = printFibo(n - 1);
        int fib2 = printFibo(n - 2);
        int fn = fib1 + fib2;
        return fn;
    }
}
