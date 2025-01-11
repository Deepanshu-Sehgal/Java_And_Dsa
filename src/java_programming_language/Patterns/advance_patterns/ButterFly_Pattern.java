package java_programming_language.Patterns.advance_patterns;

public class ButterFly_Pattern {
    public static void Butter_Fly(int n) {
        //1st half
        for (int i = 1; i <= n; i++) {
            //starts - i
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            //spaces - 2*(n-1)
            for (int j = 1; j <= 2 * (n - i); j++) {
                System.out.print(" ");
            }
            //starts - i
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        //second half
        for (int i = n; i >= 1; i--) {
            //starts - i
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            //spaces - 2*(n-1)
            for (int j = 1; j <= 2 * (n - i); j++) {
                System.out.print(" ");
            }
            //starts - i
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Butter_Fly(5);
    }
}
