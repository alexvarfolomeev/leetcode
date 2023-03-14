package ru.company.leetcode_easy;

import java.util.Arrays;
import java.util.List;
import java.util.Stack;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Baseball {
    public static int calPoints(String[]ops) {
        int result = 0;
        Stack<Integer>stack = new Stack<>();
        for (String s : ops) {
            if ("+".equals(s)) {
                int op1 = stack.pop();
                int op2 = op1 + stack.peek();
                stack.push(op1);
                stack.push(op2);
            } else if ("C".equals(s)) {
                stack.pop();
            } else if ("D".equals(s)) {
                stack.push(2 * stack.peek());
            } else {
                stack.push(Integer.parseInt(s));
            }
        }
        while (!stack.isEmpty()) {
            result += stack.pop();
        }
        return result;
    }
}
