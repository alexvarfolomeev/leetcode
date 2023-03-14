package ru.company.yandex_contest;

import java.io.*;
import java.util.HashMap;
import java.util.Stack;

public class RightBrackets {
    static final String input = "C:\\Users\\79639\\IdeaProjects\\leet_code\\src\\ru\\company\\leetcode_easy\\input.txt";
    //static final String output = "output.txt";
    static BufferedReader br;

    public static void main(String[] args) throws IOException {
        String answer = "yes";
        br = new BufferedReader(new FileReader(input));
        HashMap<Character, Character> characterHashMap = new HashMap<>();
        characterHashMap.put('(', ')');
        characterHashMap.put('[', ']');
        characterHashMap.put('{', '}');
        Stack<Character> stack = new Stack<>();
        char[] chars = br.readLine().toCharArray();
        for (char ch : chars) {
            if (characterHashMap.containsKey(ch)) {
                stack.add(ch);
            } else if (stack.empty()) {
                answer = "no";
            } else if (ch != characterHashMap.get(stack.pop())) {
                answer = "no";
            }
        }
        System.out.println(!stack.empty() ? "no" : answer);
    }
}
