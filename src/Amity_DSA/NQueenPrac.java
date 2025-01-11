package Amity_DSA;

import static data_structure_and_algorithm.Back_Tracking.NQueens.printBoard;

public class NQueenPrac {
    public static void main(String[] args) {
        int n = 2;
        char[][] board = new char[n][n];
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                board[i][j] = '.';
            }
        }
        nQueenNew(board, 0);
    }

    static void nQueenNew(char[][] board, int row) {
        if (row == board.length) {
            printBoard(board);
            return;
        }

        for (int i = 0; i < board.length; i++) {
            board[row][i] = 'Q';
            nQueenNew(board, row + 1);
            board[row][i] = '.';

        }

    }
}