package java_programming_language.loops_flow_statements.practice;

public class twoLoop {
    public static void main(String[] args) {
        int even = 0, odd = 0;
        for (int i = 0; i < 10; i++) {
            if (i % 2 == 0) {
                even += i;
            } else {
                odd += i;
            }
        }
        System.out.println("The sum of even number is: " + even);
        System.out.println("The sum of odd number is: " + odd);
    }
}
