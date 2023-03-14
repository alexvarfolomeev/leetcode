package ru.company.leetcode_easy;

public class SearchInsertPosition {
    public static void main(String[] args) {
        int[]arr = {1, 3, 5, 6};
        int[]arr_2 = {1, 3};
        int target = 7;
        System.out.println(new SearchInsertPosition().searchInsert(arr, target));}
    public int searchInsert(int[] nums, int target) {
        int low = 0;
        int middle = 0;
        int high = nums.length - 1;
        while (low <= high) {
            middle = (low + high) / 2;
            if (nums[middle] == target) {
                return middle;
            }
            if (nums[middle] < target) {
                low = middle + 1;
            } else {
                high = middle - 1;
            }
        }
        return high + 1;
    }
}
