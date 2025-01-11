package java_programming_language.Patterns.advance_patterns;

public class Inverted_Half_Pyramid {
    public static void half_Pyramid(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i + 1; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        half_Pyramid(5);
    }
}
