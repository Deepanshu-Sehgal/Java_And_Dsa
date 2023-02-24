package data_structure_and_algorithm.Recursion;

//time complexity = O(Log n)
public class Print_x_power_n_Oprimized {
    public static void main(String[] args) {
        System.out.println(OptimizedPower(2, 10));
    }

    public static int OptimizedPower(int number, int power) {
        if (power == 0) {
            return 1;
        }
        int halfPower = OptimizedPower(number, power / 2) * OptimizedPower(number, power / 2);

        //power is odd
        if (power % 2 != 0) {
            halfPower = number * halfPower;
        }

        return halfPower;
    }
}
