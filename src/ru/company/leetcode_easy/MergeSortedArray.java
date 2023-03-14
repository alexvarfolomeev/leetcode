package ru.company.leetcode_easy;

import java.util.Arrays;

public class MergeSortedArray {
    public static void main(String[] args) {
        int[]nums1 = {1, 2, 3, 0, 0, 0};
        int[]nums2 = {2, 5, 6};
        int[]nums3 = {4,5,6,0,0,0};
        int[]nums4 = {1,2,3};
        merge(nums3, 3, nums4, 3);
        System.out.println(Arrays.toString(nums3));

    }

    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        if (nums1.length == 0){
            nums1 = nums2;
        } else {
            for (int i = nums1.length - 1; i >= m; i--) {
                nums1[i] = nums2[n - 1];
                n--;
            }
            boolean isSorted = false;
            while (!isSorted){
                isSorted = true;
                for (int i = 0; i < nums1.length - 1; i++) {
                    if (nums1[i] > nums1[i + 1]) {
                        isSorted = false;
                        int temp = nums1[i];
                        nums1[i] = nums1[i + 1];
                        nums1[i + 1] = temp;
                    }
                }
            }
        }
    }
}
