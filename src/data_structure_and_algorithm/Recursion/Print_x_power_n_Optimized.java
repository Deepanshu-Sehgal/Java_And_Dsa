package data_structure_and_algorithm.Recursion;

//time complexity = O(Log n)

public class Print_x_power_n_Optimized {
    public static void main(String[] args) {
        System.out.println(OptimizedPower(2, 5));
        System.out.println(fastPower(2.0, 5.0));
        System.out.println(fastPowerModulo(2.0, 5.0, 30));
    }

    public static int OptimizedPower(int number, int power) {
        if (power == 0) { //base case
            return 1;
        }

        int halfPower = OptimizedPower(number, power / 2);
        int halfPowerSq = halfPower * halfPower;

        //power is odd
        if (power % 2 != 0) { //power is odd
            halfPowerSq = number * halfPowerSq;
        }

        return halfPowerSq;
    }

    public static double fastPower(double a, double b) {
        if (b == 0) return 1;
        if (b % 2 == 0) return fastPower(a * a, b / 2);
        else return a * fastPower(a, b - 1);
    }

    public static double fastPowerModulo(double a, double b, int m) {

        if (b == 0) return 1;

        if (b < 0) return fastPowerModulo(1 / a, Math.abs(b), m);
        if (b % 2 == 0) return fastPowerModulo((a % m * a % m) % m, b / 2, m);
        else return (a % m * fastPowerModulo(a % m, b - 1, m) % m);
    }
}
