package data_structure_and_algorithm.Stack;

import java.util.ArrayDeque;

public class InfixToPostFixExpression {
    public static void main(String[] args) {
        String expression = "a + b - d * ( e + f ) * g";
        System.out.println(infixToPostfix(expression));
    }

    static int precedence(String s) {
        return switch (s) {
            case "^" -> 3;
            case "*", "/" -> 2;
            case "+", "-" -> 1;
            default -> -1;
        };
    }

    public static String infixToPostfix(String s) {
        String tokens[] = s.split(" ");
        ArrayDeque<String> stack = new ArrayDeque<>();
        StringBuilder sb = new StringBuilder();
        for (String token : tokens) {
            if (token.equals("(")) stack.push(token);
            else if (isOperator(token)) {
                while (!stack.isEmpty() && precedence(stack.peek()) >= precedence(token)) {
                    String temp = stack.pop();
                    sb.append(temp).append(" ");
                }
                stack.push(token);
            } else if (token.equals(")")) {
                while (!stack.isEmpty() && !stack.peek().equals("(")) {
                    String temp = stack.pop();
                    sb.append(temp).append(" ");
                }
                stack.pop();
            } else { //operand
                sb.append(token).append(" ");
            }
        }

        while (!stack.isEmpty()){
            sb.append(stack.pop()).append(" ");
        }
        return sb.toString();

    }

    static boolean isOperator(String s) {
        return s.equals("+") || s.equals("-") || s.equals("*") || s.equals("/") || s.equals("^");
    }
}
