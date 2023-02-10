package data_structure_and_algorithm.Bit_Manupulation;

public class Binary_Ones_Complement_or_NOT {
    public static void main(String[] args) {
        int a = ~5; // one,s complement it gives -ve number to get +ve number we have to do teo's complement
        int b = ~a + 1; // two's complement of number to convert it in +ve number
        System.out.println(b);
    }
}
