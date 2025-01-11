package data_structure_and_algorithm.two_d_Arrays;

import java.util.Scanner;

public class Creation_two_d_Array {


    public static void main(String[] args) {
        int[][] matrix = new int[3][3]; //init of 2d array
        Scanner sc = new Scanner(System.in);
        int n = matrix.length, m = matrix[0].length;
        //n = row & m = col


        //taking input of 2D array elements
        for (int row = 0; row < n; row++) {
            for (int col = 0; col < m; col++) {
                matrix[row][col] = sc.nextInt();
            }
        }

        //output of 2D array
        for (int row = 0; row < n; row++) {
            for (int col = 0; col < m; col++) {
                System.out.print(matrix[row][col] + " ");
            }
            System.out.println();
        }


    }
}
