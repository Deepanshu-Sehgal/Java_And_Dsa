package data_structure_and_algorithm.two_d_Arrays.practice;

public class TransposeMatrix {

    public static void printMatrix(int[][] arr){
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[][] array = {{3,42,4},{5,3,23}};
        int[][] arr = new int[3][2];

        printMatrix(array);
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                arr[j][i] = array[i][j];
            }
        }

        printMatrix(arr);


    }
}
