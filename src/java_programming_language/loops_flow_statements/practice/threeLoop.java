package java_programming_language.loops_flow_statements.practice;

public class threeLoop {
    public static void main(String[] args) {
        int fact = 1;
        for (int i = 1; i < 5; i++) {
            fact *= i;
        }
        System.out.println(fact);
    }
}
