package java_programming_language.Patterns.advance_patterns;

public class Floyd_Triangle {
    public static void floyd_triangle(int n) {
        int counter = 1;
        for (int i = 1; i <= n; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(counter + " ");
                counter++;
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        floyd_triangle(5);
    }
}
