package data_structure_and_algorithm.Recursion;

public class Print_All_Subsets {
    public static void main(String[] args) {
        printSubset("abc");

    }

    static void printSubset(String s) {
        printSubsetHelper(s, 0, "");

    }

    static void printSubsetHelper(String s, int i, String curr) {
        if (i == s.length()) {
            System.out.println(curr);
            return;
        }
        printSubsetHelper(s, i + 1, curr + s.charAt(i));
        printSubsetHelper(s, i + 1, curr);
    }

}
