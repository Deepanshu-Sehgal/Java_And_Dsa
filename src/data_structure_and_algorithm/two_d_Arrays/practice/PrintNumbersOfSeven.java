package data_structure_and_algorithm.two_d_Arrays.practice;

public class PrintNumbersOfSeven {
    public static void main(String[] args) {
        int[][] arr = {{4, 5, 7}, {5, 7, 6}};
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] == 7)
                    count++;
            }
        }
        System.out.println(count);
    }
}
