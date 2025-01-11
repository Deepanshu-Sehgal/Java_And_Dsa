package data_structure_and_algorithm.Recursion;

//time and space complexity = O(n)
public class Sum_of_natural_num {
    public static void main(String[] args) {
        System.out.println(calSum(5));

    }

    static int calSum(int n) {

        if (n == 1) {
            return 1;
        }
        int snm1 = calSum(n - 1);
        return n + snm1;
    }
}
