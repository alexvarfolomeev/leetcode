package ru.company.leetcode_easy;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class MaxDepth {
    public static void main(String[] args) {
        //3,9,20,null,null,15,7]

        TreeNode treeNode = new TreeNode(3, new TreeNode(9, null, null), new TreeNode(20, new TreeNode(15), new TreeNode(7)));
        System.out.println(new MaxDepth().maxDepth(treeNode));
    }
    public int maxDepth(TreeNode root) {
        if (root == null) return 0;
        int left = maxDepth(root.left);
        int right = maxDepth(root.right);
        return Math.max(left, right) + 1;
    }
}
