package data_structure_and_algorithm.Recursion;

//time complexity and space complexity = O(n)

public class First_Occurence {
    public static void main(String[] args) {
        int[] arr = {8, 3, 6, 9, 5, 10, 22, 5, 3};
        System.out.println(firstOccurence(arr, 5, 0));
    }

    public static int firstOccurence(int[] arr, int key, int i) {
        if (i == arr.length) //base case
            return -1;


        if (arr[i] == key) {
            return i;
        }
        return firstOccurence(arr, key, i + 1);
    }
}
