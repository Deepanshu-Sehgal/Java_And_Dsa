package java_programming_language.loops_flow_statements.practice;

import java.util.Scanner;

public class fourLoop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number to print table");
        int table = sc.nextInt();
        for (int i = 1; i <= 10; i++) {
            System.out.println(table + " * " + i + " = " + table * i);
        }
    }
}
