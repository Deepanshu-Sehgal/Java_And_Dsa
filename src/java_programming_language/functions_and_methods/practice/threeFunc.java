package java_programming_language.functions_and_methods.practice;

public class threeFunc {
    public static void main(String[] args) {
        System.out.println(isPalinDrome(221));
    }

    public static boolean isPalinDrome(int a) {
        int sum = 0;
        int temp = a % 10;
        sum = (sum * 10) + temp;
        a = a / 10;
        return a == sum;
    }
}
