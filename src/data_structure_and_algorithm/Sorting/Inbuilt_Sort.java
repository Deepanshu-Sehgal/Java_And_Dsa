package data_structure_and_algorithm.Sorting;

import java.util.Arrays;
import java.util.Collections;

/*
Time complexity = O(n logn)
*/

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
       Arrays.sort(arr); // inbuilt sort

        Arrays.sort(arr,2,5); // inbuilt sorting by adding start and end indexing or from and to

        //Arrays.sort(arr, Collections.reverseOrder()); // for decending order use collection.reverseOrder()
        //Arrays.sort(arr ,2,5, Collections.reverseOrder()); // inbuilt sorting by adding start and end indexing or from and to
        printArr("Inbuilt sort",arr);

    }
}
