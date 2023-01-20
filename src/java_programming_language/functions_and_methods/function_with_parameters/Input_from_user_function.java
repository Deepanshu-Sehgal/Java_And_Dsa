package java_programming_language.functions_and_methods.function_with_parameters;

import java.util.Scanner;

public class Input_from_user_function {
    public static int calSum(int a, int b) { // this is parameters or formal parameters
        return (a + b);
    }

    public static void main(String[] args) {
        System.out.println("Enter number");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int sum = calSum(a, b); //this is arguments or actual parameters
        System.out.println("Sum is : " + sum);
    }
}
