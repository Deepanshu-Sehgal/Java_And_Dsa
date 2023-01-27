package data_structure_and_algorithm.Arrays.Searching;

public class Largest_Number {
    public static int get_largest(int[] number) {
        int largest = Integer.MIN_VALUE; //-infinity
        for (int i = 0; i < number.length; i++) {
            if (largest < number[i]) {
                largest = number[i];
            }
        }
        return largest;
    }

    public static void main(String[] args) {
        int[] number = {1, 2, 3, 34, 5, 10,};
        System.out.println("Largest number is : " + get_largest(number));
    }
}
