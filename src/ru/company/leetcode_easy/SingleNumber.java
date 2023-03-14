package ru.company.leetcode_easy;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.Stack;
import java.util.stream.Collectors;

public class SingleNumber {
    public static void main(String[] args) {
        int[]array = {4,1,2,1,2};
        int[]array_2 = {2,2,1};
        int[]array_3 = {1};
        int[]array_4 = {1, 1, 1, 3, 3, 4, 3, 2, 4, 2};
        int[]array_5 = {1, 2, 3, 4};
        System.out.println(new SingleNumber().singleNumber(array));
        System.out.println(new SingleNumber().singleNumber(array_2));
        System.out.println(new SingleNumber().singleNumber(array_3));

        System.out.println(new SingleNumber().containsDuplicates(array_4));
        System.out.println(new SingleNumber().containsDuplicates(array_5));

        System.out.println(new SingleNumber().convertToTitle(701));
    }

    public int singleNumber(int[] nums) {
        Stack<Integer>stack = new Stack<>();
        if(nums.length == 1){
            return nums[0];
        }
        Arrays.sort(nums);
        for (int i : nums) {
            if(!stack.contains(i)){
                stack.push(i);
            } else {
                stack.pop();
            }
        }
        return stack.get(0);
    }

    public String convertToTitle(int columnNumber) {
        String ans = "";
        while (columnNumber>0){
            columnNumber--;
            ans = (char) ('A'+ (columnNumber%26)) + ans;
            columnNumber = columnNumber/26;
        }
        return ans;
    }

    public boolean containsDuplicates(int[]nums){
        return Arrays.stream(nums).boxed().collect(Collectors.toSet()).size() == nums.length;
    }
}
