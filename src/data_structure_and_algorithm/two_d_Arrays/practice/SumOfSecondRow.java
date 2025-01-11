package data_structure_and_algorithm.two_d_Arrays.practice;

public class SumOfSecondRow {
    public static void main(String[] args) {
        int[][] array = {{4, 5, 6}, {11, 4, 3}, {5, 6, 2}};
        int sum = 0;

        for (int j = 0; j < array[0].length; j++) {
            sum = sum + array[1][j];
        }
        System.out.println(sum);
    }
}

