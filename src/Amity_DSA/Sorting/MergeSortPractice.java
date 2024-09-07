package Amity_DSA.Sorting;

import static data_structure_and_algorithm.Divide_And_conquer.Merge_Sort.printArray;

public class MergeSortPractice {
    public static void main(String[] args) {
        int[] arr = {6, 3, 9, 5, 2, 8};
        mergeSort(arr, 0, arr.length - 1);
        printArray(arr);
    }

    static void mergeSort(int arr[], int si, int ei) {
        if (si >= ei) {
            return;
        }

        int mid = si + (ei - si) / 2;

        mergeSort(arr, si, mid);
        mergeSort(arr, mid + 1, ei);
        mergeBoth(arr, si, mid, ei);
    }

    static void mergeBoth(int arr[], int si, int mid, int ei) {
        int temp[] = new int[ei - si + 1];
        int left = si;
        int right = mid + 1;
        int iterator = 0;

        while (left <= mid && right <= ei) {
            if (arr[left] < arr[right]) {
                temp[iterator] = arr[left];
                left++;
            } else {
                temp[iterator] = arr[right];
                right++;
            }
            iterator++;
        }

        //left
        while (left <= mid) {
            temp[iterator++] = arr[left++];
        }

        while (right <= ei) {
            temp[iterator++] = arr[right++];
        }

        for (iterator = 0, left = si; iterator < temp.length; iterator++, left++) {
                arr[left] = temp[iterator];
        }

    }
}