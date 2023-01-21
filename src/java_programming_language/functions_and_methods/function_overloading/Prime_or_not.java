package java_programming_language.functions_and_methods.function_overloading;

public class Prime_or_not {

    //only for n>2
    public static boolean isPrime(int n) {
        //Corner cases
        if (n == 2) {
            return true;
        }
        for (int i = 2; i < n - 1; i++) {
            if (n % i == 0) { // Completely dividing
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(isPrime(12));

    }
}
