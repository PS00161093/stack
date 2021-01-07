package src;

import java.util.Stack;

import static java.lang.Character.isLetterOrDigit;

class InFixPostFix {

    public static void main(String[] args) {

        String exp = "a+b*(c^d-e)^(f+g*h)-i";
        System.out.println(infixToPostfix(exp));
    }

    static String infixToPostfix(String exp) {

        StringBuilder result = new StringBuilder("");
        Stack<Character> stack = new Stack<>();

        for (char c : exp.toCharArray()) {

            if (isLetterOrDigit(c)) result.append(c);
            else if (c == '(') stack.push(c);
            else if (c == ')') {
                while (!stack.isEmpty() && stack.peek() != '(') {
                    result.append(stack.pop());
                }
                stack.pop();
            } else {
                while (!stack.isEmpty() && precedenceOf(c) <= precedenceOf(stack.peek())) {
                    result.append(stack.pop());
                }
                stack.push(c);
            }
        }

        while (!stack.isEmpty()) {
            if (stack.peek() == '(') return "Invalid data bro";
            result.append(stack.pop());
        }

        return result.toString();
    }

    static int precedenceOf(char ch) {

        switch (ch) {
            case '+':
            case '-':
                return 1;

            case '*':
            case '/':
                return 2;

            case '^':
                return 3;
        }

        return -1;
    }
}