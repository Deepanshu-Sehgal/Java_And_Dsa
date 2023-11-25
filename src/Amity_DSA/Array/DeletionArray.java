package Amity_DSA.Array;

public class DeletionArray {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int positionToDelete = 2; // Change this to the position you want to delete

        int[] newArr = new int[arr.length - 1];
        int newIndex = 0;
        for (int i = 0; i < arr.length; i++) {
            if (i != positionToDelete) {
                newArr[newIndex] = arr[i];
                newIndex++;
            }
        }
        arr = newArr;


        System.out.print("Updated Array: ");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}
