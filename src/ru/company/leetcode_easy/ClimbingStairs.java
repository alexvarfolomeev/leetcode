package ru.company.leetcode_easy;

public class ClimbingStairs {
    public static void main(String[] args) {
        TreeNode treeNode =
                new TreeNode(5,
                        new TreeNode(4,
                                new TreeNode(11,
                                        new TreeNode(7, null, null),
                                        new TreeNode(2, null, null)),
                                null),
                        new TreeNode(8,
                                new TreeNode(13, null, null),
                                new TreeNode(4, null,
                                        new TreeNode(1, null, null))));

        TreeNode treeNode_2 =
                new TreeNode(1,
                        new TreeNode(2, null, null),
                        new TreeNode(3, null, null))
                ;
        TreeNode treeNode_3 =
                new TreeNode(1, null, null);

//        System.out.println(new ClimbingStairs().hasPathSum_2(treeNode, 22));
        System.out.println(new ClimbingStairs().hasPathSum_2(treeNode_2, 5));
//        System.out.println(new ClimbingStairs().hasPathSum_2(treeNode_3, 0));
    }

    public boolean hasPathSum(TreeNode root, int targetSum) {
        if(root == null) {
            return false;
        }
        var difference = targetSum - root.val;
        boolean result = false;
        if (difference == 0) {
            return true;
        }
        if (root.left != null && difference > 0 && !result){
            result = hasPathSum(root.left, difference);
        }
        if (root.right != null && difference > 0 && !result){
            result = hasPathSum(root.right, difference);
        }
        return result;
    }

    public boolean hasPathSum_2(TreeNode root, int targetSum) {
        var result = false;
        if(root == null) {
            return false;
        }
        var current = root.val;
        if (root.left != null && current + root.left.val != targetSum) {
            result = hasPathSum_2(root.left, targetSum - root.left.val);
            return result;
        }
        if (root.right != null && current + root.right.val != targetSum) {
            result = hasPathSum_2(root.right, targetSum - root.right.val);
            return result;
        }
        if (targetSum == 0 && root.val != 0) {
            return result = true;
        }
        return result;
    }
}
