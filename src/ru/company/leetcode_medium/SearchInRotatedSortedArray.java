package ru.company.leetcode_medium;

import static ru.company.leetcode_medium.SearchInRotatedSortedArray.binarySearch;

public class SearchInRotatedSortedArray {

    public static void main(String[] args) {
        int[]nums = {4,5,6,7,0,1,2,3};
        int target = 0;
        System.out.println(search(nums, target));
    }

    public static int search(int[] nums, int target) {
        if(nums == null || nums.length == 0){
            return -1;
        }
        var idx = 0;
        for(int i = 0;i < nums.length - 1;i++){
            if(nums[i] > nums[i + 1]){
                idx = i;
                break;
            }
        }
        int left = binarySearch(nums, 0, idx, target);
        int right = binarySearch(nums, idx + 1, nums.length - 1, target);
        if(left == -1 && right == -1){
            return -1;
        }
        return left == -1 ? right : left;
    }

    public static int binarySearch(int[]array, int start, int end, int target){
        if(start > end) {
            return -1;
        }
        int mid = (start + end) / 2;
        if (array[mid] == target){
            return mid;
        }
        if(array[mid] < target){
            return binarySearch(array, mid + 1, end, target);
        } else {
            return binarySearch(array, start, mid - 1, target);
        }
    }
}
