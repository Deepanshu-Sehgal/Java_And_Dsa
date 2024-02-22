package data_structure_and_algorithm.Recursion;

//space complexity = O(n) and time complexity = O(2^n)
public class  Fibonacci_number {
    public static void main(String[] args) {
        System.out.println(printFibo(5));
    }

    public static int printFibo(int n) {
        if (n == 0 || n == 1) {
            return n;
        }
        return printFibo(n - 1) + printFibo(n - 2);
    }
}