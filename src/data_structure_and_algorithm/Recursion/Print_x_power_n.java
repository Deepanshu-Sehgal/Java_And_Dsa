package data_structure_and_algorithm.Recursion;

//time complexity = O(n)
public class Print_x_power_n {
    public static void main(String[] args) {
        System.out.println(Power(2, 10));
    }

    public static int Power(int number, int power) {
        if (power == 0) {
            return 1;
        }
        return number * Power(number, power - 1);
    }
}
