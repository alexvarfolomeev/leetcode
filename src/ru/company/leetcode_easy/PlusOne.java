package ru.company.leetcode_easy;

import java.util.Arrays;

public class PlusOne {

    public static int[] plusOne(int [] array) {
        Double number = 0D;
        for (int i = 0; i <= array.length - 1; i++) {
            number = number * 10 + array[i];
        }
        number = number + 1;
        String s = number.toString();
        int[]result = new int[s.length()];
        for (int i = 0; i < s.length(); i++){
            result[i] = s.charAt(i) - '0';
        }
        return result;
    }
}
