package java_programming_language.Patterns.practice;

public class Rectangle_Hollow {
    public static void main(String[] args) {
        hollow(4, 5);
    }

    public static void hollow(int row, int col) {
        for (int i = 1; i <= row; i++) {
            for (int j = 1; j <= col; j++) {
                if (i == 1 || i == row || j == 1 || j == col)
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            System.out.println();
        }
    }
}
