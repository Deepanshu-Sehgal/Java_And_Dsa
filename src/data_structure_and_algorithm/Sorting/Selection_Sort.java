package data_structure_and_algorithm.Sorting;

public class Selection_Sort {

    public static void selectionSort(int[] arr) {

        //loop to access each array element
        for (int step = 0; step < arr.length - 1; step++) {

            //find the minimum element in the array
            int minPos = step;
            for (int j = step + 1; j < arr.length; j++) {

                // To sort in descending order, change > to < in this line.
                // Select the minimum element in each loop.
                if (arr[minPos] > arr[j]) {
                    minPos = j;
                }
            }

            //swap and  put minimum at the correct position
            int temp = arr[minPos];
            arr[minPos] = arr[step];
            arr[step] = temp;
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
        selectionSort(arr);
        printArr("After", arr);
    }
}
