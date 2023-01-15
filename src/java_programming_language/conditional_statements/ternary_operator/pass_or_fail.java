package java_programming_language.conditional_statements.ternary_operator;

import java.util.Scanner;

public class pass_or_fail {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter marks");
        int marks = sc.nextInt();

        String result = marks >= 33 ? "Pass" : "Fail";


        System.out.println(result);
    }
}
