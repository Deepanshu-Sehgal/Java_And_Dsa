package java_programming_language.loops_flow_statements.Break_stmt;

import java.util.Scanner;

public class Enter_numbers_till_mul_of_ten_enters {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        do {
            System.out.println("Enter your number");
            int n = scanner.nextInt();
            if (n % 10 == 0)
                break;
            System.out.println(n);

        } while (true);
    }
}
