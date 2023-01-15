package java_programming_language.conditional_statements.ternary_operator;

public class ternary_operator {
    public static void main(String[] args) {
        int number = 4;

        String type = (number % 2 == 0) ? "Even" : "Odd";
        System.out.println(type);
    }
}
