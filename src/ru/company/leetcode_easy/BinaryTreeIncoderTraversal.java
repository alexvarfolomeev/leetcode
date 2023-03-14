package ru.company.leetcode_easy;

import java.util.*;
import java.util.stream.Collectors;

public class BinaryTreeIncoderTraversal {

    public static void main(String[] args) {
        TreeNode test = new TreeNode(1, null, new TreeNode(2, new TreeNode(3), null));
        var r = new BinaryTreeIncoderTraversal().inorderTraversal(test);
        r.forEach(System.out::println);
        System.out.println(5 / 2);
        System.out.println(majorityElement(new int[]{2, 2, 1, 1, 1, 2, 2}));

    }

    public List<Integer> inorderTraversal(TreeNode root) {
        var result = new ArrayList<Integer>();
        if (root == null) {
            return result;
        }
        result.add(root.val);
        if (root.left != null) {
            result.addAll(inorderTraversal(root.left));
        } else if (root.right != null) {
            result.addAll(inorderTraversal(root.right));
        }
        return result;
    }

    public static int majorityElement(int[] nums) {
        nums = Arrays.stream(nums).sorted().toArray();
        return nums[(int) Math.floor(nums.length / 2)];
    }
}
