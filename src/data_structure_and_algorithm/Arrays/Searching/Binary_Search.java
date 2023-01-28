package data_structure_and_algorithm.Arrays.Searching;

public class Binary_Search {
    public static int binary_Search(int[] numbers, int key) {
        int start = 0, end = numbers.length - 1;
        while (start <= end) {
            int mid = (start + end) / 2; //mid
            if (numbers[mid] == key) {
                return mid;
            }
            if (numbers[mid] < key) { // if mid less then key update right
                start = mid + 1;
            } else { //else mid more then key update left
                end = mid - 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] number = {2, 3, 4, 5, 6, 67, 89, 90}; //sorted array
        int key = 6; //key to search
        int result=binary_Search(number, key);
        System.out.println(result);
    }
}
