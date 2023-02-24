package data_structure_and_algorithm.Recursion;

//time complexity = O(Log n)

public class Print_x_power_n_Oprimized {
    public static void main(String[] args) {
        System.out.println(OptimizedPower(2, 5));
    }

    public static int OptimizedPower(int number, int power) {
        if (power == 0) { //base case
            return 1;
        }

        int halfPower = OptimizedPower(number, power / 2);
        int halfPowerSq =  halfPower * halfPower;

        //power is odd
        if (power % 2 != 0) {
            halfPowerSq = number * halfPowerSq;
        }

        return halfPowerSq;
    }
}
