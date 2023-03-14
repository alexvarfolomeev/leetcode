package ru.company.leetcode_medium;

import ru.company.leetcode_easy.TreeNode;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class PathSum_2 {

    public static void main(String[] args) {
        TreeNode treeNode1 =
                new TreeNode(5,
                        new TreeNode(4,
                                new TreeNode(11,
                                        new TreeNode(7),
                                        new TreeNode(2, null, null)), null),
                        new TreeNode(8,
                                new TreeNode(13, null, null),
                                new TreeNode(4,
                                        new TreeNode(5, null, null),
                                        new TreeNode(1, null, null))));

        System.out.println(getSum(treeNode1, 22));

        System.out.println(pathSum(treeNode1, 22));
    }
    private static List<List<Integer>> resultList = new ArrayList<List<Integer>>();

    public static void pathSumInner(TreeNode root, int sum, Stack<Integer> path) {
        path.push(root.val);
        if(root.left == null && root.right == null)
            if(sum == root.val) resultList.add(new ArrayList<Integer>(path));
        if(root.left!=null) pathSumInner(root.left, sum-root.val, path);
        if(root.right!=null)pathSumInner(root.right, sum-root.val, path);
        path.pop();
    }

    public static List<List<Integer>> pathSum(TreeNode root, int sum) {
        if(root==null) return resultList;
        Stack<Integer> path = new Stack<Integer>();
        pathSumInner(root, sum, path);
        return resultList;
    }
    public static Integer getSum(TreeNode node, int target){
        int sum = node.val;
            if(node.left != null || node.right != null) {
                if (node.left != null) {
                    sum += getSum(node.left, target);
                }
                if (node.right != null) {
                    sum += getSum(node.right, target);
                }
            }

        return sum;
    }
}
