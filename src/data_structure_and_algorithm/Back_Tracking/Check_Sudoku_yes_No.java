package data_structure_and_algorithm.Back_Tracking;

public class Check_Sudoku_yes_No {

    public static boolean isSafeSudoku(int[][] sudoku, int row, int col, int digit) {

        //columns
        for (int i = 0; i <= 8; i++) {
            if (sudoku[i][col] == digit) return false;
        }

        //rows
        for (int i = 0; i <= 8; i++) {
            if (sudoku[row][i] == digit) return false;
        }

        //grid

        return true;
    }

    public static boolean sudokuSolver(int[][] sukoku, int row, int col) {
        //base case

        if (row == 9 && col == 9) return true;
        else if (row == 9) return false;


        //recursion
        int nextRow = row, nextCol = col + 1;
        if (col + 1 == 9) {
            nextRow = row + 1;
            nextCol = 0;
        }

        //already set elements
        if (sukoku[row][col] != 0)
            return sudokuSolver(sukoku, nextRow, nextCol);


        for (int digits = 1; digits <= 9; digits++) {
            if (isSafeSudoku(sukoku, row, col, digits)) {
                sukoku[row][col] = digits;
                if (sudokuSolver(sukoku, nextRow, nextCol)) // if Solution Exist
                    return true;
                sukoku[row][col] = 0;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[][] sudoku = {{3, 0, 6, 5, 0, 8, 4, 0, 0},
                {5, 2, 0, 0, 0, 0, 0, 0, 0},
                {0, 8, 7, 0, 0, 0, 0, 3, 1},
                {0, 0, 3, 0, 1, 0, 0, 8, 0},
                {9, 0, 0, 8, 6, 3, 0, 0, 5},
                {0, 5, 0, 0, 9, 0, 6, 0, 0},
                {1, 3, 0, 0, 0, 0, 2, 5, 0},
                {0, 0, 0, 0, 0, 0, 0, 7, 4},
                {0, 0, 5, 2, 0, 6, 3, 0, 0}};

    }
}
