package data_structure_and_algorithm.Sorting;

/*
if not sorted
time complexity = O(n^2)

if already sorted
time complexity = O(n)
*/
public class Bubble_Sort {

    //perform the bubble sort
    public static void bubbleSort(int[] arr) {
        boolean swapped;

        //loop to access each array element
        for (int turn = 0; turn < arr.length - 1; turn++) {

            //check if swapping occurs
            swapped = false;

            //loop to compare adjacent elements
            for (int j = 0; j < arr.length - 1 - turn; j++) {

                //compare two array elements
                //change > to <  to sort in descending order
                if (arr[j] > arr[j + 1]) {
                    //swap occurs if elements are not in the intended order
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swapped = true;
                }
            }

            // no swapping means the array is already sorted
            // so no need for further comparison
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
        int[] arr = {5,4,1,3,2};
        printArr("Before", arr);
        bubbleSort(arr);
        printArr("After", arr);
    }
}
