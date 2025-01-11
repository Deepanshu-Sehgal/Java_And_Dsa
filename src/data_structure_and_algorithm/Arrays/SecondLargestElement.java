package data_structure_and_algorithm.Arrays;

public class SecondLargestElement {
    public static void main(String[] args) {
        int[] arr = {10, 7, 8, 15, 34};

        System.out.println(secondLargest(arr));

    }

    static int secondLargest(int[] arr) {
        int result = -1, largest = 0;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > arr[largest]) {
                result = largest;
                largest = i;
            } else if (arr[i] != arr[largest]) {
                if (result == -1 || arr[i] > arr[result])
                    result = i;
            }
        }
        return result;
    }
}