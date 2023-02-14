package data_structure_and_algorithm.Bit_Manupulation;

public class Clear_ith_bit {
    public static int clearBit(int n,int i){
        int bitMask = ~(1<<i);
        return n & bitMask;
    }

    public static void main(String[] args) {
        System.out.println(clearBit(10,1));

    }
}
