package data_structure_and_algorithm.Recursion;

import java.sql.SQLOutput;

public class Print_numbers_Desc {
    public static void main(String[] args) {
        DescendingOrder(10);
    }

    public static void DescendingOrder(int n) {

        if (n == 1) { //base case
            System.out.print(1);
            return;
        }
        System.out.print(n + " ");
        DescendingOrder(n - 1);
    }
}
