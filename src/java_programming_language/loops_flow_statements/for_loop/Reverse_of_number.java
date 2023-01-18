package java_programming_language.loops_flow_statements.for_loop;

import java.util.Scanner;

public class Reverse_of_number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter number to reverse");
        int n = sc.nextInt();
        for (int i = n; i > 0; ) {
            int lastdigit = i % 10;
            System.out.print(lastdigit);
            i = i / 10;
        }
        System.out.println();
    }
}
