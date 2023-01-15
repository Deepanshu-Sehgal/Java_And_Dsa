package java_programming_language.conditional_statements.if_else_if_;

import java.util.Scanner;

public class income_tax_calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Income");
        int income = sc.nextInt();
        int tax;
        if (income < 500000) {
            tax = 0;
        } else if (income >= 500000 && income < 1000000) {
            tax = (int) (income * (0.2));
        } else {
            tax = (int) (income * (0.3));
        }
        System.out.println("your tax is : " + tax + " on income of : " + income);
    }
}
