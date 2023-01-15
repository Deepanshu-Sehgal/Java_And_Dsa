package java_programming_language.conditional_statements.if_else_;

import java.util.Scanner;

public class odd_even_if_else {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number to check even or odd");
        int number = sc.nextInt();
        if (number % 2 == 0) {
            System.out.println(number + " is even");
        } else {
            System.out.println(number + " is odd");
        }
    }
}
