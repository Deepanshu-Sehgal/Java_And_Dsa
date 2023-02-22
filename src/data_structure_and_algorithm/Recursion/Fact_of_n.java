package data_structure_and_algorithm.Recursion;

//time and space complexity = O(n)
public class Fact_of_n {
    public static void main(String[] args) {
        System.out.println(factorial(5));

    }

    public static int factorial(int n) {
        if (n == 0)
            return 1;

        int fact_of_n = n * factorial(n - 1);
        return fact_of_n;
    }
}
