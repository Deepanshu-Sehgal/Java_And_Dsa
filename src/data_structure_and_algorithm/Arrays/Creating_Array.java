package data_structure_and_algorithm.Arrays;

public class Creating_Array {

    static void traversing(int[] arr, int length) {
        for (int i = 0; i < length; i++) {
            System.out.print(arr[i]);
        }
    }

    static void insertion(int[] arr, int length, int pos, int newEle) {
        int[] newArr = new int[length + 1];
        if (length >= 0) System.arraycopy(arr, 0, newArr, 0, length);
        newArr[pos] = newEle;
        if (length - pos >= 0) System.arraycopy(arr, pos, newArr, pos + 1, length - pos);

        arr = newArr;

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String[] args) {
        int[] marks = new int[50];
        int[] number = {1, 2, 3};
        String[] fruits = {"Apple", "Mango", "Orange"};
        traversing(number, number.length);
        System.out.println();
        insertion(number, number.length, 1, 10);
    }


}

/*
traversing
insertion
deletion
searching
merging
sorting
*/
