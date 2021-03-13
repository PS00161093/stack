package src;

import java.util.Stack;

import static java.lang.Character.*;

public class BalancedExpression {

    public static void main(String[] args) {

        String expression = "(){[]}";
        String expression1 = "{[(){}[]]}(";
        System.out.println(isBalancedExpression(expression));
        System.out.println(isBalancedExpression(expression1));

    }

    static boolean isBalancedExpression(String expression) {

        Stack<Character> stack = new Stack<>();
        for (char c : expression.toCharArray()) {
            if (!isLetterOrDigit(c)) {
                switch (c) {
                    case '(':
                    case '{':
                    case '[':
                        stack.push(c);
                        break;
                    default:
                        char c1 = stack.empty() ? '#' : stack.pop();
                        if (getOpeningBracket(c) != c1) {
                            return false;
                        }
                        break;
                }
            }
        }

        return stack.isEmpty();
    }

    private static char getOpeningBracket(char c) {

        if (c == ')') return '(';
        else if (c == '}') return '{';
        else return '[';
    }

}