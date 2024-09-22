package data_structure_and_algorithm.Back_Tracking;

public class Nqueens_printOneSol {

    static int count;

    public static void main(String[] args) {
        int n = 4;
        char board[][] = new char[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                board[i][j] = '.';
            }
        }

        if (nQueens(board, 0)) {
            System.out.println("Solution is possible");
            printBoard(board);
        } else {
            System.out.println("Solution is not possible");
        }
        System.out.println("total ways to solve n queens = " + count);
    }

    private static boolean nQueens(char[][] board, int row) {
        //base case
        if (row == board.length) {
            //printBoard(board);
            count++;
            return true;
        }

        //column loop
        for (int i = 0; i < board.length; i++) {
            if (isSafe(board, row, i)) {
                board[row][i] = 'Q';

                if (nQueens(board, row + 1)) {
                    return true;
                }//function call
                board[row][i] = '.';//backtracking step
            }

        }
        return false;
    }

    private static boolean isSafe(char[][] board, int row, int col) {
        //vertical up
        for (int i = row - 1; i >= 0; i--) {
            if (board[i][col] == 'Q')
                return false;
        }

        //diagonal left up
        for (int i = row - 1, j = col - 1; i >= 0 && j >= 0; i--, j--) {
            if (board[i][j] == 'Q')
                return false;
        }

        //diagonal right up
        for (int i = row - 1, j = col + 1; i >= 0 && j < board.length; i--, j++) {
            if (board[i][j] == 'Q')
                return false;
        }

        return true;
    }

    private static void printBoard(char[][] board) {
        System.out.println("---------chess board---------");
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board.length; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
    }
}
