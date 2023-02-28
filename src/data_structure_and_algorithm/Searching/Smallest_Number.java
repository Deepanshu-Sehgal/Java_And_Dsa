package data_structure_and_algorithm.Searching;

public class Smallest_Number {
    public static int get_smallest(int[] number) {
        int smallest = Integer.MAX_VALUE; //+infinity
        for (int i = 0; i < number.length; i++) {
            if (smallest > number[i]) {
                smallest = number[i];
            }
        }
        return smallest;
    }

    public static void main(String[] args) {
        int[] number = {1, 2, 3, 34, 5, 10,};
        System.out.println("Smallest number is : " + get_smallest(number));
    }
}
