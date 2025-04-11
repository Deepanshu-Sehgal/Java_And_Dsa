package data_structure_and_algorithm.Stack;

import java.util.ArrayDeque;

public class ParenthesesMatchingProblem {
    public static void main(String[] args) {
        String exp = "(({})[])";
        System.out.println(validParentheses(exp));
    }

    static boolean validParentheses(String s) {
        ArrayDeque<Character> stack = new ArrayDeque<>();

        for (int i = 0; i < s.length(); i++) {
            char cur = s.charAt(i);

            if (cur == '(' || cur == '{' || cur == '[') {
                stack.push(cur);
            } else {
                if (stack.isEmpty()) return false;
                char opening = stack.pop();
                if ((opening == '(' && cur == ')') || (opening == '{' && cur == '}') || (opening == '[' && cur == ']')) {
                    continue;
                } else return false;
            }

        }
        return stack.isEmpty();

    }
}
