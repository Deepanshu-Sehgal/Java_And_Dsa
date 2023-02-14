package data_structure_and_algorithm.Bit_Manupulation;

public class Power_of_two_or_not {
    public static boolean isPowerOfTwo(int n) {
        return (n & (n - 1)) == 0;
    }

    public static void main(String[] args) {
        System.out.println(isPowerOfTwo(89));

    }
}
