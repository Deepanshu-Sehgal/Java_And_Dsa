package java_programming_language.functions_and_methods.function_with_parameters;

import java.util.Scanner;

public class Input_from_user_function {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int sum = a+b;
        System.out.println(sum);
    }
}
