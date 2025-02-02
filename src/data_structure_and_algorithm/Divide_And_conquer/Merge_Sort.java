package data_structure_and_algorithm.Divide_And_conquer;

/*
time complexity  = O(n log n)
space complexity = O(n)
*/
public class Merge_Sort {
    public static void main(String[] args) {
        int[] arr = {6, 3, 9, 5, 2, 8};
        mergeSort(arr, 0, arr.length - 1);
        printArray(arr);
    }

    public static void mergeSort(int[] arr, int si, int ei) {
        if (si >= ei) { // base case
            return;
        }
        //kam
        int mid = si + (ei - si) / 2;
        mergeSort(arr, si, mid); //left part
        mergeSort(arr, mid + 1, ei); //right part
        merge(arr, si, mid, ei); //merge left and right part in array
    }

    public static void merge(int[] arr, int si, int mid, int ei) {

        int[] temp = new int[ei - si + 1];//left(0,3) = 4 right(4,6)=3 -> 6-0+1
        int i = si; //iterator for left part
        int j = mid + 1; //iterator for right part
        int k = 0;//iterator for temp arr


        while (i <= mid && j <= ei) {
            if (arr[i] < arr[j]) {
                temp[k] = arr[i];
                i++;
            } else {
                temp[k] = arr[j];
                j++;
            }
            k++;
        }

        //for leftover elements of 1st sorted part
        //left part
        while (i <= mid) {
            temp[k++] = arr[i++];
        }

        //for left over elements of 1ns sorted part
        while (j <= ei) {
            temp[k++] = arr[j++];
        }

        //copy temp to original array
        for (k = 0, i = si; k < temp.length; k++, i++) {
            arr[i] = temp[k];
        }

    }

    public static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}