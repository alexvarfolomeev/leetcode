package ru.company.leetcode_easy;

import static java.util.Objects.isNull;
import static java.util.Objects.nonNull;

public class MinDepth {
    public int minDepth(TreeNode root) {
        int sum = root.val;
        if (nonNull(root.left)) {
            sum += minDepth(root.left);
        }
        if(nonNull(root.right)) {
            sum += minDepth(root.right);
        }
        return sum;
    }

    public int minLeftDepth(TreeNode root) {
        int sum = 0;
        if(root.right == null && root.left == null) {
            return sum;
        }
        if (root.left != null){
            if (root.left.left == null && root.left.right == null) {
                sum += root.left.val;
            } else {
                sum += minDepth(root.left);
            }
        }
        sum += minLeftDepth(root.right);
        return sum;
    }



    public int minDepth1(TreeNode root) {
        if (isNull(root)) {
            return 0;
        }
        if (isNull(root.left) && isNull(root.right)) {
            return 1;
        }
        if (isNull(root.left)) {
            return 1 + minDepth1(root.right);
        }
        if (isNull(root.right)) {
            return 1 + minDepth1(root.left);
        }
        return 1 + Math.min(minDepth1(root.left), minDepth1(root.right));
    }

}
