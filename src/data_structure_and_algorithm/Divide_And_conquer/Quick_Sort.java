package data_structure_and_algorithm.Divide_And_conquer;

//time complexity in best case = O(n log n)
// and in worst case O(n^2)
// and space complexity = O(1)
public class Quick_Sort {
    public static void main(String[] args) {

        int[] arr = {6, 3, 9, 8, 2, 5};
        quickSort(arr, 0, arr.length - 1);
        printArray(arr);

    }

    public static void quickSort(int[] arr, int si, int ei) {

        //base case
        if (si >= ei) {
            return;
        }

        //last element
        int pivotIndex = partition(arr, si, ei);
        quickSort(arr, si, pivotIndex - 1); // left part from pivot
        quickSort(arr, pivotIndex + 1, ei); //right part from pivot
    }

    private static int partition(int[] arr, int si, int ei) {
        int pivot = arr[ei];
        int i = si - 1; //to make place for elements smaller then pivot

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
        //swap
        int temp = pivot;
        arr[ei] = arr[i];
        arr[i] = temp;

        return i;
    }

    public static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
