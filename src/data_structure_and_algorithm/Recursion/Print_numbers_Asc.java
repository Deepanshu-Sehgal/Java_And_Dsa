package data_structure_and_algorithm.Recursion;

public class Print_numbers_Asc {
    public static void main(String[] args) {
        printIncreasingOrder(10);
    }

    public static void printIncreasingOrder(int n) {

        if (n == 1) { //base case
            System.out.print(n + " ");
            return;
        }
        printIncreasingOrder(n - 1);
        System.out.print(n + " ");
    }
}
