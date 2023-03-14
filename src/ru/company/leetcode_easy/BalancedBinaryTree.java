package ru.company.leetcode_easy;

public class BalancedBinaryTree {
    public static void main(String[] args) {
        TreeNode treeNode = new TreeNode(3, new TreeNode(9, null, null),
                new TreeNode(20,
                        new TreeNode(15, null, null), new TreeNode(7, null, null)));

        new BalancedBinaryTree().isBalanced(treeNode);
    }

    public boolean isBalanced(TreeNode root) {
        if(root == null) return true;
        return Math.max(checkHeight(root.left), checkHeight(root.right)) - Math.min(checkHeight(root.left), checkHeight(root.right)) <= 1;
    }

    //Решение не до конца верное, смотри Leetcode профиль
    public int checkHeight(TreeNode root){
        if(root == null) return 0;
        int left_height = 0, right_height = 0;
        if(root.left != null || root.right != null){
            if(root.left != null)  left_height += checkHeight(root.left);
            if(root.right != null) right_height += checkHeight(root.right);
        }
        return Math.max(left_height, right_height) + 1;
    }
}
