package java_programming_language.Patterns.practice;

public class FloydsTriangle {
    public static void main(String[] args) {
        int counter = 1;
        for (int i = 0; i <= 3; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(counter);
                counter++;
            }
            System.out.println();
        }
    }
}
