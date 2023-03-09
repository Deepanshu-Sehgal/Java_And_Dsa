package data_structure_and_algorithm.Back_Tracking;

//space and time complexity = O(n)
public class Backtracking_on_array {
    public static void changeArray(int[] arr, int index, int value) {

        //base case
        if (index == arr.length) {
            printArray(arr);
            return;

        }
        //recursion
        arr[index] = value;
        changeArray(arr, index + 1, value + 1); //function call
        arr[index] = arr[index] - 2; // backtracking step = after calling function when we do any work that is backtracking


    }

    private static void printArray(int[] arr) {
        for (int j : arr) {
            System.out.print(j + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] arr = new int[5];
        changeArray(arr, 0, 1);
        printArray(arr);

    }


}
