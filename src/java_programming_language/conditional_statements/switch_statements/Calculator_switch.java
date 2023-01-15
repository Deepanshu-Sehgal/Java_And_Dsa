package java_programming_language.conditional_statements.switch_statements;

import java.util.Scanner;

public class Calculator_switch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1st number");
        int a = sc.nextInt();
        System.out.println("Enter 2nd number");
        int b = sc.nextInt();
        System.out.println("Enter + - * / %  to perform action");
        char operator = sc.next().charAt(0);

        switch (operator) {
            case '+': {
                System.out.println("sum is : " + (a + b));
                break;
            }
            case '-': {
                System.out.println("sub is : " + (a - b));
                break;
            }
            case '*': {
                System.out.println("mul is : " + (a * b));
                break;
            }
            case '/': {
                System.out.println("div is : " + (a / b));
                break;
            }
            case '%': {
                System.out.println("reminder is : " + (a % b));
                break;
            }
            default:
                System.out.println(" no character exist");
        }
    }

}
