package java_programming_language.variable_and_datatypes;

import java.util.Scanner;

public class Average_of_N_numbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 3 numbers to get average");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int avg = (a + b + c) / 3;
        System.out.println(avg);
    }
}
