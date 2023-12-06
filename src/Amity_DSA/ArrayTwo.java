package Amity_DSA;

import java.util.Scanner;
public class ArrayTwo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of rows you want to enter:- ");
        int row = sc.nextInt();
        System.out.println("Enter number of columns you want to enter:- ");
        int col = sc.nextInt();
        int[][] arr = new int[row][col];

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.println("enter " + (i+1) + " of " + (j+1) + " element");
                arr[i][j] = sc.nextInt();
            }
        }

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }



    }
}
