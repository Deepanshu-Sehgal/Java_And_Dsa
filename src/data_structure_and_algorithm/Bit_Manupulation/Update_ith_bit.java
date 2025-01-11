package data_structure_and_algorithm.Bit_Manupulation;

public class Update_ith_bit {

    public static int clearBit(int n, int i) {
        int bitMask = ~(1 << i);
        return n & bitMask;
    }

    public static int setIthBit(int n, int i) {
        int bitMask = 1 << i;
        return n | bitMask;

    }

    public static int update_ith_bit(int n, int i, int newBit) {
        /*if (newBit == 0){
            return clearBit(n,i);
        }
        else {
            return setIthBit(n,i);
        }*/

        n = clearBit(n, i); //1st step clear ith bit
        int bitMask = newBit << i; //2nd step newBit left shift i
        return n | bitMask;
    }

    public static void main(String[] args) {
        System.out.println(update_ith_bit(10, 2, 1));
    }
}
