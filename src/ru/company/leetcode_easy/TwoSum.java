package ru.company.leetcode_easy;

import java.util.HashMap;

public class TwoSum {
    public static void main(String[] args) {
        //nums = [2,7,11,15], target = 9
        int [] nums = {2,7,11,15};
        var target = 9;
        System.out.println(new TwoSum().twoSum(nums, target));
    }

    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer>map = new HashMap<>();
        for(int i = 0;i < nums.length;i++){
            int required_num = target - nums[i];
            if(map.containsKey(required_num)){
                int[]array = {map.get(required_num), i};
                return array;
            }
            map.put(nums[i], i);
        }
        return null;
    }
}
