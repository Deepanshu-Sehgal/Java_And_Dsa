package data_structure_and_algorithm.Bit_Manupulation;
//google amazon
public class   Count_set_bits {
    public static int countSetBits(int n) {
        int count = 0;
        while (n > 0) {
            if ((n & 1) != 0) { //our lsb
                count++;
            }
            n = n >> 1;
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println(countSetBits(10));
    }
}
