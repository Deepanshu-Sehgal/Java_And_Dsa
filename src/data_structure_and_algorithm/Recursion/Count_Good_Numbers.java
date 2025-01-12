package data_structure_and_algorithm.Recursion;

public class Count_Good_Numbers {
    public static long MOD = 1000000007;

    public static void main(String[] args) {
        System.out.println(countGoodNumbers(50));
    }

    public static int countGoodNumbers(long n) {
        long odd = n / 2;
        long even = (n + 1) / 2;
        return (int) (pow(5, even) * pow(4, odd) % MOD);

    }

    public static long pow(long x, long n) {
        if (n == 0) return 1;

        // calculating power recursively x^(n/2)
        long temp = pow(x, n / 2);

        if (n % 2 == 0) return (temp * temp) % MOD;
        else return (x * temp * temp) % MOD;
    }
}
