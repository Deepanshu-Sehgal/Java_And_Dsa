package java_programming_language.functions_and_methods.practice;

public class fiveFunc {
    public static void main(String[] args) {
        System.out.println(computeInt(12345));
    }

    public static int computeInt(int a) {
        int sum = 0;
        while (a != 0) {
            sum = sum + a % 10;
            a = a / 10;
        }
        return sum;
    }
}
