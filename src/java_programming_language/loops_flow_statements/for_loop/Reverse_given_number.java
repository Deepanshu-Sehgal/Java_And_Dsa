package java_programming_language.loops_flow_statements.for_loop;

public class Reverse_given_number {
    public static void main(String[] args) {
        int n = 1562001;
        int rev = 0;
        while (n > 0) {
            int lastDigit = n % 10;
            rev = (rev * 10) + lastDigit;
            n = n / 10;
        }
        System.out.println(rev);
    }
}
