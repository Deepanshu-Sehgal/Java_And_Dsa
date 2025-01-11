package Amity_DSA.Sorting;

import static data_structure_and_algorithm.Divide_And_conquer.Merge_Sort.printArray;

public class QuickSortPractice {
    public static void main(String[] args) {
        int[] arr = {6, 3, 9, 5, 2, 8};
        QuickSort(arr, 0, arr.length - 1);
        printArray(arr);
    }

    static void QuickSort(int[] arr, int si, int ei) {
        if (si >= ei)
            return;

        int pidx = partitionNew(arr, si, ei);
        QuickSort(arr, si, pidx - 1);
        QuickSort(arr, pidx + 1, ei);
    }

    static int partitionNew(int[] arr, int si, int ei) {
        int pivot = arr[ei];
        int i = si - 1;

        for (int j = si; j < ei; j++) {
            if (arr[j] <= pivot) {
                i++;

                //swap
                int temp = arr[j];
                arr[j] = arr[i];
                arr[i] = temp;
            }
        }
        i++;
        int temp = pivot;
        arr[ei] = arr[i];
        arr[i] = temp;
        return i;

    }
}