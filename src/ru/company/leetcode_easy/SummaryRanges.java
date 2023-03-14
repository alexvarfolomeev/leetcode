package ru.company.leetcode_easy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SummaryRanges {

    public static void main(String[] args) {
        int[] arr = {0, 1, 2, 4, 5, 7};
        new SummaryRanges().summaryRanges(arr);
    }


    public List<String> summaryRanges(int[] nums) {
        List<String> result = new ArrayList<>();
        if(nums.length == 1){
            result.add(nums[0] + "");
            return result;
        }
        String arrow = "->";
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < nums.length; i++) {
            int curr = nums[i];
            int next = nums[i + 1];
            while(i + 1 < nums.length && next - curr == 1){
                i++;
            }
            if (curr != nums[i]) {
                result.add(curr + arrow + nums[i]);
            } else {
                result.add(curr + "");
            }
        }
        return result;
    }
}
