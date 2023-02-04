package data_structure_and_algorithm.two_d_Arrays;

/*

Very Important question
Google amazon apple oracle microsoft adobe

*/
public class Spiral_matrix {
    public static void printSpiral(int[][] matrix) {
        int startRow = 0;
        int startCol = 0;
        int endRow = matrix.length - 1;
        int endCol = matrix[0].length - 1;

        while (startRow <= endRow && startCol <= endCol) {
            //top boundary
            for (int j = startCol; j <= endCol; j++) {
                System.out.print(matrix[startRow][j] + " ");
            }

            //right
            for (int i = startRow + 1; i < endRow; i++) {
                System.out.print(matrix[i][endCol] + " ");
            }

            //bottom
            for (int i = endCol - 1; i >= startCol; i--) {
                System.out.print(matrix[endRow][i]);
            }

            //left
            for (int i = endCol - 1; i >= startRow + 1; i--) {
                System.out.print(matrix[i][startCol]);
            }

            startCol++;
            startRow++;
            endRow--;
            endCol--;
        }
        System.out.println();

    }

    public static void main(String[] args) {
        int[][] matrix = {
                {1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12},
                {13, 14, 15, 16}
        };

        printSpiral(matrix);

    }
}
