package java_programming_language.conditional_statements.practice;

import java.util.Scanner;

public class one {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num = sc.nextInt();
        if (num < 0)
            System.out.println("Number is negative: " + num);
        else
            System.out.println("Number is positive: " + num);
    }
}
