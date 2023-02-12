package data_structure_and_algorithm.Bit_Manupulation;

public class Get_ith_Bit {
    public static int getIthBit(int n, int i) {
        int bitMask = 1 << i; //shifting 1 by ith position and rest of all bits are 0
        if ((n & bitMask) == 0) {
            return 0;
        } else {
            return 1;
        }
    }

    public static void main(String[] args) {
        System.out.println(getIthBit(10, 2));
    }
}
