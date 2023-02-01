package data_structure_and_algorithm.Sorting;

public class Bubble_Sort {
    public static void bubbleSort(int[] arr) {
        boolean swapped;
        for (int turn = 0; turn < arr.length - 1; turn++) {
            swapped = false;
            for (int j = 0; j < arr.length - 1 - turn; j++) {
                if (arr[j] > arr[j + 1]) {
                    //swap
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swapped = true;
                }
            }
            if (!swapped)
                break;
        }
    }

    public static void printArr(String msg, int[] arr) {
        System.out.println(msg);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        printArr("Before", arr);
        bubbleSort(arr);
        printArr("After", arr);
    }
}
