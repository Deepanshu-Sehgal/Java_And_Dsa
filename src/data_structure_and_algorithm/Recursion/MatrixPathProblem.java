package data_structure_and_algorithm.Recursion;

public class MatrixPathProblem {
    public static void main(String[] args) {
        System.out.println(pathProblem(2,2));
    }

    static int pathProblem(int row, int column) {

        if (row == 1 || column == 1) return 1;
        return pathProblem(row - 1, column) + pathProblem(row, column - 1);
    }
}
