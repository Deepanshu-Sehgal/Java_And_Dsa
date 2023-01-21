package java_programming_language.functions_and_methods.function_with_parameters;

import java.util.Scanner;

public class FInd_Product {
    public static int multiply(int a, int b) {
        return a * b;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println("Product of " + a + " and " + b + " is " + multiply(a, b));
    }
}
