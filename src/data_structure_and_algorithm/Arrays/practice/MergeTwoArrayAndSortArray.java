package data_structure_and_algorithm.Arrays.practice;

import java.util.Arrays;

public class MergeTwoArrayAndSortArray {

    public static int[] merge(int[] nums1, int m, int[] nums2, int n) {
//        for (int j = 0, i = m; j < m; j++) {
//            nums1[i] = nums2[j];
//            i++;
//        }
//        Arrays.sort(nums1);
//        return nums1;

        int i1 = m - 1;
        int i2 = n - 1;
        int total = m + n - 1;

        while (i2 >= 0) {
            if (i1 >= 0 && nums1[i1] > nums2[i2]) {
                nums1[total--] = nums1[i1--];
            } else {
                nums1[total--] = nums2[i2--];
            }
        }
        return nums1;
    }

    public static void main(String[] args) {
        int[] nums1 = {1, 2, 3, 0, 0, 0};
        int m = 3;
        int[] nums2 = {2, 5, 6};
        int n = 3;

        System.out.println(Arrays.toString(merge(nums1, m, nums2, n)));

    }
}