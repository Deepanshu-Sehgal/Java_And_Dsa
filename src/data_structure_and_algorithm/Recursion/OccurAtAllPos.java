package data_structure_and_algorithm.Recursion;

public class OccurAtAllPos {
    public static void main(String[] args) {
        int[] arr = {3, 2, 4, 5, 6, 2, 7, 2, 2};
        AllOccurence(arr, 2, 0);
        System.out.println();
    }

    public static void AllOccurence(int[] arr, int key, int i) {
        if (i == arr.length) //base case
            return;


        if (arr[i] == key) {
            System.out.print(i + " ");
        }
        AllOccurence(arr, key, i + 1);
    }
}
