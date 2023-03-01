package data_structure_and_algorithm.Divide_And_conquer;

/*
question/input = sorted, rotated array with the distinct numbers(in ascending order)
it is rotated at a pivot point. find the index of given element
*/

public class Search_in_rotated_sorted_Array {
    public static void main(String[] args) {
        int[] arr = {4, 5, 6, 7, 0, 1, 2};
        int target = 0;
        int targetIndex = search(arr, target, 0, arr.length - 1);
        System.out.println(targetIndex);
    }

    private static int search(int[] arr, int target, int si, int ei) {

        //base case
        if (si > ei) {
            return -1;
        }


        //kaam
        int mid = si + (ei - si) / 2;

        //case found
        if (arr[mid] == target) {
            return mid;
        }

        //mid-on line 1
        if (arr[si] <= arr[mid]) {
            //case a:left
            if (arr[si] <= target && target <= arr[ei]) {
                return search(arr, target, si, mid - 1);
            }

            //case b: right
            else {
                return search(arr, target, mid + 1, ei);
            }

        }

        //mid line 2
        else {
            //case c: right
            if (arr[mid] <= target && target <= arr[ei]) {
                return search(arr, target, mid + 1, ei);
            }
            //case d:Left
            else {
                return search(arr, target, si, mid - 1);
            }
        }
    }
}
