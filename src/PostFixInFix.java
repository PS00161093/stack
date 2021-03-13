package src;

import java.util.Stack;

import static java.lang.Character.isAlphabetic;
import static java.lang.String.valueOf;

public class PostFixInFix {

    public static void main(String[] args) {

        String input = "ab*c+";

        Stack<String> stack = new Stack<>();
        for (char c : input.toCharArray()) {
            if (isAlphabetic(c)) stack.push(valueOf(c));
            else stack.push("(" + stack.pop() + c + stack.pop() + ")");
        }

        System.out.println(stack.pop());
    }
}