package java_programming_language.loops_flow_statements;

import java.util.*;

public class Prime_number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if (n == 2)
            System.out.println(n + " is prime");
        else {
            boolean isPrime = true;
            for (int i = 2; i <= Math.sqrt(n); i++) {
                if (n % i == 0)  //n i sa multiple of i(i not equal to 1 or n)
                    isPrime = false;
            }
            if (isPrime == true)
                System.out.println(n + " is prime");
            else
                System.out.println(n + " is not prime");
        }
    }
}
