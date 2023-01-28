package data_structure_and_algorithm.Arrays;

public class Reverse_an_array {
    public static void reverse(int[] numbers) {
        int start = 0, end = numbers.length - 1;
        while (start < end) {
            int temp = numbers[end];
            numbers[end] = numbers[start];
            numbers[start] = temp;
            start++;
            end--;
        }

    }

    public static void main(String[] args) {
        int[] number = {2, 4, 25, 52, 1, 4, 5,};
        reverse(number);
        for (int i = 0; i < number.length; i++) {
            System.out.print(number[i] + " ");
        }
        System.out.println();
    }
}
