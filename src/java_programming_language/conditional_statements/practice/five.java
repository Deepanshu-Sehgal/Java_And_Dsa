package java_programming_language.conditional_statements.practice;

import java.util.Scanner;

public class five {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a year to check it is leap year or not: ");
        int year = sc.nextInt();
        if ((year % 4 == 0) && (year % 400 == 0) || (year % 100 != 0))
            System.out.println("Leap year");
        else
            System.out.println("Not a leap year");
    }
}
