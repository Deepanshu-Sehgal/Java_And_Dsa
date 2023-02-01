package data_structure_and_algorithm.Sorting;

import java.util.Arrays;

public class Inbuilt_Sort {
    public static void printArr(String msg, int[] arr) {
        System.out.println(msg);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int[] arr = {5,4,1,3,2};
        Arrays.sort(arr);
        printArr("Inbuilt sort",arr);

    }
}
