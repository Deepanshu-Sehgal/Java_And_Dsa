package java_programming_language.variable_and_datatypes;

import java.util.Scanner;

public class Product {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number");
        int a = sc.nextInt();
        System.out.println("Enter the second number");
        int b = sc.nextInt();
        int product = a * b;
        System.out.println("The ans is " + product);
    }
}
