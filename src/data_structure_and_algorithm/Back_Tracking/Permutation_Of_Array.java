package data_structure_and_algorithm.Back_Tracking;

import java.util.ArrayList;

public class Permutation_Of_Array {
    public static void main(String[] args) {
        int a[] = {1, 2, 3};
        ArrayList<int[]> ans = new ArrayList<>();
        permute(a, 0, a.length - 1,ans);
        System.out.println("Print array");

        for (int[] e : ans) {
            printArrPerm(e);
        }

    }

    static void permute(int a[], int l, int r,ArrayList<int[]> ans) {
        if (l == r) {
            printArrPerm(a);
            int[] temp = new int[a.length];
            for (int i = 0; i < a.length; i++) {
                temp[i] = a[i];
            }
            ans.add(temp);
            return;
        }
        for (int i = l; i <= r; i++) {
            swap(a, i, l);
            permute(a, l + 1, r,ans);
            swap(a, i, l); //back tracking
        }
    }

    private static void swap(int[] a, int l, int r) {
        int temp = a[l];
        a[l] = a[r];
        a[r] = temp;
    }

    private static void printArrPerm(int[] a) {
        for (int e : a) {
            System.out.print(e);
        }
        System.out.println();
    }
}
