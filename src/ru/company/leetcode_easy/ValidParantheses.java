package ru.company.leetcode_easy;

import java.util.HashMap;
import java.util.Stack;

public class ValidParantheses {

    public static void main(String[] args) {
        String s = "))[]{}";
        System.out.println(new ValidParantheses().isValid(s));
    }

    public boolean isValid(String s) {
        char[] f = s.toCharArray();
        Stack stack = new Stack();
        HashMap<Character, Character> characterHashMap = new HashMap<>();
        characterHashMap.put('(', ')');
        characterHashMap.put('{', '}');
        characterHashMap.put('[', ']');

        for (char c : f)  {
            if (characterHashMap.containsKey(c)) {
                stack.add(c);
            } else if (stack.empty()) {
                return false;
            } else if (c != characterHashMap.get(stack.pop())) {
                return false;
            }
        }
        return stack.empty();
    }
}
