package java_programming_language.Patterns.advance_patterns;

public class Hollow_Rectangle {
    public static void hollow_rectangle(int totRows, int totCols) {
        //outer loop - Rows
        for (int i = 1; i <= totRows; i++) {
            //outer loop - Columns
            for (int j = 1; j <= totCols; j++) {
                //cell - (i,j)
                if (i == 1 || i == totRows || j == 1 || j == totCols) {
                    //Boundary Cells
                    System.out.print("*  ");
                } else {
                    System.out.print(" ");
                }

            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        hollow_rectangle(4, 5);
    }
}
