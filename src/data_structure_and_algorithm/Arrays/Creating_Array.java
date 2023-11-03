package data_structure_and_algorithm.Arrays;

public class Creating_Array {

    static void traversing(int[] arr,int length){
        for (int i = 0; i < length; i++) {
            System.out.print(arr[i]);
        }
    }

    static void insertion(int[] arr,int length,int pos,int newEle){
        int[] newArr = new int[length+1];
        for (int i = 0; i < length; i++) {
            newArr[i] =arr[i];
        }
        newArr[pos] = newEle;
        for (int i = pos; i < length; i++) {
            newArr[i+1] = arr[i];
        }

        arr = newArr;

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
    public static void main(String[] args) {
        int[] marks = new int[50];
        int[] number = {1, 2, 3};
        String[] fruits = {"Apple", "Mango", "Orange"};
        traversing(number,number.length);
        System.out.println();
        insertion(number,number.length,1,10);
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
