package ru.company.leetcode_medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LongestConsecutiveSequence {
    public static void main(String[] args) {
        int[] t = {100, 4, 200, 1, 3, 2};
        System.out.println(longestConsecutive(t));
        //[1,2,0,1]

        System.out.println(new LongestConsecutiveSequence().generateParenthesis(3));

        System.out.println(new LongestConsecutiveSequence().morseCode("...."));
    }

    public static int longestConsecutive(int[] nums) {
        if (nums.length == 0) return 0;
        Arrays.sort(nums);
        int max = 1;
        int result = 1;
        for (int i = 1; i < nums.length; i++) {
            if(nums[i]!=nums[i-1]){
                if(nums[i]==nums[i-1]+1){
                    max+=1;
                }
                else{
                    result = Math.max(result,max);
                    max = 1;
                }
            }
        }
        return Math.max(max,result);
    }

    public List<String> generateParenthesis(int n) {
        List<String> result = new ArrayList<>();
        backtrack(result, "", 0, 0, n);
        return result;
    }

    private void backtrack(List<String> result, String current, int open, int close, int max) {
        if (current.length() == max * 2) {
            result.add(current);
            return;
        }

        if (open < max) {
            backtrack(result, current + "(", open + 1, close, max);
        }
        if (close < open) {
            backtrack(result, current + ")", open, close + 1, max);
        }
    }

    public List<String> morseCode(String morseCode) {
        List<String> result = new ArrayList<>();
        int i = 0;
        while (i < morseCode.length() - 1) {
            if (morseCode.charAt(i) == '.' && morseCode.charAt(i + 1) == '.') {
                result.add(morseCode.substring(0, i) + "--" + morseCode.substring(i + 2));
            }
            i++;
        }
        return result;
    }

}
