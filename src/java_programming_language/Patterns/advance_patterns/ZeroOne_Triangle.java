package java_programming_language.Patterns.advance_patterns;

public class ZeroOne_Triangle {
    public static void Triangle(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                if ((i+j) % 2 == 0)
                    System.out.print("0");
                else
                    System.out.print("1");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Triangle(5);
    }
}
