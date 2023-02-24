package data_structure_and_algorithm.Recursion;

public class Last_Occurence {
    public static void main(String[] args) {
            int[] arr = {8, 3, 6, 9, 5, 10, 22, 5, 3};
            System.out.println(LastOccurence(arr, 5, 0));
        }

    public static int LastOccurence ( int[] arr, int key, int i){
        if (i == arr.length) //base case
            return -1;

        int isFound = LastOccurence(arr, key, i + 1);

        if (isFound == -1 && arr[i] == key) {
            return i;
        }

        return isFound;
    }
}
