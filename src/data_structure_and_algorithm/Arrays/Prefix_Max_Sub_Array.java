package data_structure_and_algorithm.Arrays;

/*
Time complexity = O(of n raise to power 2)*/
public class Prefix_Max_Sub_Array {
    public static void maxPrefixSubArray(int[] number) {
        int currSum = 0;
        int maxSum = Integer.MIN_VALUE;
        int[] prefix = new int[number.length];
        prefix[0] = number[0];

        //calculate prefix array
        for (int i = 1; i < prefix.length; i++) {
            prefix[i] = number[i - 1] + number[i];
        }


        for (int start = 0; start < number.length; start++) { //for finding Start index
            for (int end = start; end < number.length; end++) {//for finding end index
                currSum = start == 0
                        ? prefix[end]
                        : prefix[end] - prefix[start - 1];
                if (maxSum < currSum) {
                    maxSum = currSum;
                }
            }
        }
        System.out.println("Max sum of sub array is -> " + maxSum);
    }

    public static void main(String[] args) {
        int[] num = {2, 3, 4, 5, 6};
        maxPrefixSubArray(num);
    }
}

