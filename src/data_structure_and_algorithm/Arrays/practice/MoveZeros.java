package data_structure_and_algorithm.Arrays.practice;

public class MoveZeros {
    public static void main(String[] args) {
        int[] num = {0, 1, 0, 3, 12};

        moveZero(num);
    }

    private static void moveZero(int[] num) {
        for (int i = 0, j = 0; i < num.length; i++) {
            if (num[i] != 0) {
                int temp = num[i];
                num[i] = num[j];
                num[j] = temp;
                j++;
            }
        }
    }
}