package data_structure_and_algorithm.Sorting;

public class Insertion_Sort {
    public static void insertionSort(int[] arr) {

        //start from index 1 to divide array in sorted and unsorted part 0th index is a sorted part nd rest is unsorted
        for (int i = 1; i < arr.length; i++) { //{5, 4, 1, 3, 2};
            //storing 1st index element as temp
            int temp = arr[i]; //1
            // storing 0th index
            int prev = i - 1; //1

            //finding out the correct position to insert
            //comparing 0th element with 1st element weather it is small or greater if previous element is > temp then shift the 1st element to the right
            while (prev >= 0 && arr[prev] > temp) { //5>4
                arr[prev + 1] = arr[prev];
                prev--;
            }
            //insertion
            arr[prev + 1] = temp; //1 4 5
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
        int[] arr = {5, 4, 1, 3, 2};
        printArr("Before", arr);
        insertionSort(arr);
        printArr("After", arr);
    }
}
