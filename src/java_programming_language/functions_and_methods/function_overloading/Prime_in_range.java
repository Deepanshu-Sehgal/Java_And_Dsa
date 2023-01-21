package java_programming_language.functions_and_methods.function_overloading;

public class Prime_in_range {
    public static void primeInRange(int n) {
        for (int i = 2; i <= n; i++) {
            if (isPrime(i)) {
                System.out.print(i + " ");
            }
        }
        System.out.println();

    }

    public static boolean isPrime(int n) {
        if (n == 2) {
            return true;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) { // Completely dividing
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        primeInRange(100);
    }
}
