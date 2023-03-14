package ru.company.leetcode_easy;

import java.util.Stack;

public class Valid {

    public static boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        for (char ch : s.toCharArray()) {
            if (ch == '(') {
                stack.push(')');
            } else if(ch == '{') {
                stack.push('}');
            } else if (ch == '[') {
                stack.push(']');
            } else if(stack.isEmpty() || stack.pop() != ch) {
                return false;
            }
        }
        return stack.isEmpty();
    }
}
