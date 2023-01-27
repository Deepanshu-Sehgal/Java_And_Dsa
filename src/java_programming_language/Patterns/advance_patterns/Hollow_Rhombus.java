package java_programming_language.Patterns.advance_patterns;

public class Hollow_Rhombus {
    public static void Rhombus(int n) {
        //outer loop - Rows
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            //outer loop - Columns
            for (int j = 1; j <= n; j++) {
                //cell - (i,j)
                if (i == 1 || i == n || j == 1 || j == n) {
                    //Boundary Cells
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }

            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Rhombus(10);
    }
}
