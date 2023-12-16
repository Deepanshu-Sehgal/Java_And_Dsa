package data_structure_and_algorithm.two_d_Arrays;

import java.util.Scanner;

public class Search_in_array {
    public static boolean Search(int[][] matrix,int key){
        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[0].length; col++) {
               if (matrix[row][col] == key){
                   System.out.println("Found at cell ( " + row +" , " +col+" )");
                   return true;
               }
            }
        }
        return false;
    }

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
                System.out.print(matrix[row][col]+ " ");
            }
            System.out.println();
        }
        Search(matrix,5);


    }
}
