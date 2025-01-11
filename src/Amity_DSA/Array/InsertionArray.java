package Amity_DSA.Array;

import java.util.Arrays;

public class InsertionArray {
    public static void main(String[] args) {
        int[] originalArray = {1, 2, 3, 4, 5};
        int elementToInsert = 10;
        int positionToInsert = 2;

        System.out.println(Arrays.toString(insertX(originalArray.length, originalArray, elementToInsert, positionToInsert)));

    }

    // Function to insert x in arr at position pos
    public static int[] insertX(int n, int[] arr, int x, int pos) {
        int i;

        // create a new array of size n+1
        int[] newarr = new int[n + 1];

        // insert the elements from
        // the old array into the new array
        // insert all elements till pos
        // then insert x at pos
        // then insert rest of the elements
        for (i = 0; i < n + 1; i++) {
            if (i < pos - 1)
                newarr[i] = arr[i];
            else if (i == pos - 1)
                newarr[i] = x;
            else
                newarr[i] = arr[i - 1];
        }
        return newarr;
    }
}
