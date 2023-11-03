package Amity_DSA.Sorting;

import java.util.Scanner;

class sort2 {
    int n[] = new int[10];
    int i = 0, j = 9;
    Scanner sc = new Scanner(System.in);

    void get() {
        for (i = 0; i < 5; i++) {
            System.out.println("enter numbers for array :");
            n[i] = sc.nextInt();
        }
    }

    void insertionSORT() {
        for (int i = 1; i < 5; i++) {
            int temp = n[i];
            j = i - 1;
            while ((temp < n[j]) && (j >= 1)) {
                n[j + 1] = n[j];
                j = j - 1;
            }
            n[j + 1] = temp;
        }
    }

    void show() {
        for (i = 0; i < 5; i++) {
            System.out.print(n[i] + "\t");
        }
    }
}

public class InsertionSort {
    public static void main(String[] args) {
        sort2 a1 = new sort2();
        a1.get();
        a1.insertionSORT();
        a1.show();
    }
}