package data_structure_and_algorithm.Bit_Manupulation;

public class Clear_range_of_bits {
    public static int clearRangeOfBits(int n, int startRange, int endRange) {
        int a = ((~0) << (endRange + 1));
        int b = (1 << startRange) - 1;
        int bitMask = a | b;
        return n & bitMask;
    }

    public static void main(String[] args) {
        System.out.println(clearRangeOfBits(10, 2, 4));
    }
}
