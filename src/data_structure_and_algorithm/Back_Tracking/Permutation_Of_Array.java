package data_structure_and_algorithm.Back_Tracking;

public class Permutation_Of_Array {
    public static void main(String[] args) {
        int a[] = {1, 2, 3};
        permute(a, 0, a.length - 1);
    }

    static void permute(int a[], int l, int r) {
        if (l == r) {
            printArrPerm(a);
            return;
        }
        for (int i = l; i <= r; i++) {
            swap(a, i, l);
            permute(a, l + 1, r);
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
