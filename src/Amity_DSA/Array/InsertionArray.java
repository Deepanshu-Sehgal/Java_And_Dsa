package Amity_DSA.Array;

public class InsertionArray {
    public static void main(String[] args) {
        int[] originalArray = {1, 2, 3, 4, 5};
        int elementToInsert = 10;
        int positionToInsert = 2;

        // Check if the position is valid

        // Create a new array with one more element
        int[] newArray = new int[originalArray.length + 1];

        // Copy elements from the original array to the new array
        for (int i = 0, j = 0; i < originalArray.length; i++, j++) {
            if (i == positionToInsert) {
                newArray[j] = elementToInsert;
                j++;
            }
            newArray[j] = originalArray[i];
        }

        // If the position is at the end, insert the element at the end

        // Print the updated array
        System.out.print("Updated Array: ");
        for (int num : newArray) {
            System.out.print(num + " ");
        }
    }

}
