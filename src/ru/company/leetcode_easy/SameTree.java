package ru.company.leetcode_easy;

public class SameTree {
    public static void main(String[] args) {
        TreeNode test_3 = new TreeNode();
        TreeNode test_4 = new TreeNode();
        TreeNode test_1 =
                new TreeNode(1,
                    new TreeNode(2), null);

        TreeNode test_2 =
                new TreeNode(1,
                         null, new TreeNode(2));

        //new SameTree().isSameTree(test_1, test_2);
        new SameTree().isSameTree(test_3, test_4);

    }

    public boolean isSameTree(TreeNode p, TreeNode q) { //верное решение смотри в аккаунте на Leetcode
        boolean same = false;
        if(p == null || q == null) return same;
        if(p.val == q.val) same = true;
        if(p.left != null || q.left != null) same = isSameTree(p.left, q.left);
        if(p.right != null || q.right != null) same = isSameTree(p.right, q.right);
        return same;
    }
}
