package data_structure_and_algorithm.Arrays;
/*
Time complexity = O(n)
*/
public class Kadane_Algorithm {
    public static void MaxKadaneSubArray(int[] number) {
        int currSum = 0;
        int maxSum = Integer.MIN_VALUE;
        for (int i = 0; i < number.length; i++) {
            currSum += number[i];
            if (currSum < 0) {
                currSum = 0;
            }
            maxSum = Math.max(currSum, maxSum);
        }
        System.out.println("Max sub array is = " + maxSum);
    }

    public static void main(String[] args) {
        int[] number = {-2, -3, 4, -1, -2, 1, 5, -3};
        MaxKadaneSubArray(number);
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