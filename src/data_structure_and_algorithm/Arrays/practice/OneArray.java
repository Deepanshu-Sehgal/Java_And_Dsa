package data_structure_and_algorithm.Arrays.practice;

public class OneArray {
    public static void main(String[] args) {
//      int[] arr = {1,1,1,3,3,4,3,2,4,2};
        int[] arr = {1, 2, 3, 4};

        System.out.println(isTwice(arr));
    }

    public static boolean isTwice(int[] arr) {
        for (int i = 0; i <= arr.length; i++) {
            for (int j = i + 1; j <= arr.length - 1; j++) {
                if (arr[i] == arr[j])
                    return true;
            }
        }
        return false;
    }
}
