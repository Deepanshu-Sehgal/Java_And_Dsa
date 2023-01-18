package java_programming_language.loops_flow_statements.while_loop;

import java.util.Scanner;

public class Sum_of_first_n_natural_numbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number");
        int n = sc.nextInt();
        int counter = 1;
        int sum = 0;
        while (counter <= n) {
            sum += counter; // sum = sum + counter
            counter++;
        }
        System.out.println(sum);
    }
}
