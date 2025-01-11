package data_structure_and_algorithm.Arrays;

/*
Time complexity = O(n raise to power 3)
*/
public class Max_of_Sub_Array {

    public static void maxSubArray(int[] number) {
        int currSum = 0;
        int maxSum = Integer.MIN_VALUE;
        for (int start = 0; start < number.length; start++) { //for finding Start index
            for (int end = start; end < number.length; end++) {//for finding end index
                currSum = 0;
                for (int k = start; k <= end; k++) { //for printing sub Array's
                    System.out.print(number[k] + " ");
                    currSum += number[k];

                }
                System.out.print("sum -> " + currSum);
                if (maxSum < currSum) {
                    maxSum = currSum;
                }
                System.out.println();
            }
            System.out.println();
        }
        System.out.println("Max sum of sub array is -> " + maxSum);
    }

    public static void main(String[] args) {
        int[] num = {2, 3, 4, 5, 6};
        maxSubArray(num);
    }
}

