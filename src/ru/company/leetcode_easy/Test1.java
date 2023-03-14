package ru.company.leetcode_easy;

import java.lang.management.BufferPoolMXBean;

public class Test1 {
    public String returnDuplicates(String my_input) {
        char[] chars = my_input.toCharArray();
        StringBuilder stringBuilder = new StringBuilder();
        char current_letter;
        for (int i = 0; i < chars.length - 1; i++) {
            current_letter = chars[i];
            for (int j = i + 1; j < chars.length - 1; j++) {
                if (current_letter == chars[j]) {
                    stringBuilder.append(current_letter);
                }
            }
        }
        return stringBuilder.toString();
    }

    public int returnmax(int[] nums) {
        int max = nums[0];
        for (int i = 1; i < nums.length - 1; i++) {
            if (max < nums[i]) {
                max = nums[i];
            }
        }
        return max;
    }
}
