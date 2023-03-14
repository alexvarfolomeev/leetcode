package ru.company.leetcode_easy;

import java.util.HashMap;
import java.util.Stack;

public class RomanToInteger {
    public static void main(String[] args) {
        System.out.println(romanToInt("MCMXCIV"));        //1994
        System.out.println(romanToInt("LVIII"));          //58
        System.out.println(romanToInt("III"));            //3
        System.out.println(romanToInt("DCXXI"));          //621
        System.out.println(romanToInt("MDCCCLXXXIV"));    //1884
    }
    public static int romanToInt(String s) {
        HashMap<String, Integer>map = new HashMap<>();
        Stack<String> stack = new Stack<>();
        int sum = 0;
        map.put("I", 1);
        map.put("V", 5);
        map.put("X", 10);
        map.put("L", 50);
        map.put("C", 100);
        map.put("D", 500);
        map.put("M", 1000);
        map.put("IV", 4);
        map.put("IX", 9);
        map.put("XL", 40);
        map.put("XC", 90);
        map.put("CD", 400);
        map.put("CM", 900);
        if (s.length() == 1){
            return map.get(s);
        }
        String[]num = s.split("");
        for (String number : num) {
            if (!stack.empty()) {
                if (map.containsKey(stack.peek().concat(number))) {
                    sum += map.get(stack.peek().concat(number)) - map.get(stack.peek());
                    stack.pop();
                } else if (stack.peek().equals(number)) {
                    sum += map.get(number);
                    stack.pop();
                } else {
                    sum += map.get(number);
                    stack.pop();
                    stack.add(number);
                }
            } else if (number.equals("I") || number.equals("X") || number.equals("C")) {
                stack.add(number);
                sum += map.get(number);
            } else {
                sum += map.get(number);
            }
        }
        return sum;
    }
}
