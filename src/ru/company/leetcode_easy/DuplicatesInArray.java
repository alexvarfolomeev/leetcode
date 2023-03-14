package ru.company.leetcode_easy;

import java.util.Arrays;
import java.util.Collections;

public class DuplicatesInArray {

    public int removeDuplicates(int[] nums) {
        int tmp = nums[0];
        int counter = 1;
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] > tmp) {
                tmp = nums[i];
                nums[counter] = tmp;
                counter++;
            }
        }
        return counter;
    }
}
