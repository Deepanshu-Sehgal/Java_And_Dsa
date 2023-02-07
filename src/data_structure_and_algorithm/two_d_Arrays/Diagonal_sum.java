package data_structure_and_algorithm.two_d_Arrays;

/*
Samsung microsoft and amazon
*/
public class Diagonal_sum {

    public static int diagonal(int[][] arr) {
        int sum = 0;
        /*for (int i = 0; i < arr.length; i++) { //O(n^2)
            for (int j = 0; j < arr[0].length; j++) {
                if (i == j) { // primary diagonal
                    sum += arr[i][j];
                }
                else if (i+j == arr.length-1){ //secondary diagonal
                    sum += arr[i][j];
                }
            }
        }*/

        for (int i = 0; i < arr.length; i++) { //O(n)
            //pd
            sum += arr[i][i];
            //sd
            if (i != arr.length - 1 - i)
                sum += arr[i][arr.length - i - 1];
        }
        return sum;
    }

    public static void main(String[] args) {
        int[][] matrix = {
                {1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12},
                {13, 14, 15, 16}
        };
        System.out.println(diagonal(matrix));

    }

}
