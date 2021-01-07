package src;

import java.util.Stack;

public class PostFixInFix {

    public static void main(String[] args) {
        String input = "ab*c+";
        Stack<String> stack = new Stack<>();
        for (char c : input.toCharArray()) {
            if (Character.isAlphabetic(c))
                stack.push(String.valueOf(c));
            else {
                String c1 = stack.pop();
                String c2 = stack.pop();
                stack.push("(" + c2 + c + c1 + ")");
            }
        }
        System.out.println(stack.pop());
    }
}