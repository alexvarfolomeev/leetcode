package ru.company.leetcode_easy;

public class InvertBinaryTree {
    public static void main(String[] args) {
        TreeNode treeNode = new TreeNode(4, new TreeNode(2, new TreeNode(1), new TreeNode(3)), new TreeNode(7, new TreeNode(6), new TreeNode(9)));
        new InvertBinaryTree().invertTree(treeNode);
    }

    public TreeNode invertTree(TreeNode root) {
        if(root == null) return null;
        invertTree(root.left);
        invertTree(root.right);
        TreeNode curr = root.left;
        root.left = root.right;
        root.right = curr;
        return root;
    }
}
