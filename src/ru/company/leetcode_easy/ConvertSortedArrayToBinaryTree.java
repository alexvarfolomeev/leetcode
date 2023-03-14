package ru.company.leetcode_easy;

public class ConvertSortedArrayToBinaryTree {
    public static void main(String[] args) {
        int[] nums = {-10,-3,0,5,9};
        //System.out.println(new ConvertSortedArrayToBinaryTree().sortedArrayToBST(nums));
        System.out.println(new ConvertSortedArrayToBinaryTree().sortedArrayToBST_2(nums));
    }

    //Моё решение (идея верная, реализация хромает) - основная мысль - рекурсия
    public TreeNode sortedArrayToBST(int[] nums) {
        int low = nums[0];
        int high = nums[nums.length - 1];
        int midd_index = (nums.length - 1) / 2;
        int low_pointer = midd_index - 1;
        int high_pointer = midd_index + 1;
        TreeNode head = new TreeNode((low + high) / 2);
        while(low_pointer > low || high_pointer < nums.length){
            if(head.left == null) {
                head.left = new TreeNode(nums[low_pointer]);
            } else if (head.left.val < nums[low_pointer]) {
                TreeNode node = new TreeNode(head.left.val);
                head.left = new TreeNode(nums[low_pointer], node, null);
            } else {
                head.left.left = new TreeNode(nums[low_pointer]);
            }
            if(head.right == null){
                head.right = new TreeNode(nums[high_pointer]);
            } else if (head.right.val < nums[high_pointer]) {
                TreeNode node = new TreeNode(head.right.val);
                head.left = new TreeNode(nums[high_pointer], null, node);
            } else {
                head.right.right = new TreeNode(nums[high_pointer]);
            }
            low_pointer--;
            high_pointer++;
        }
        return head;
    }

    public TreeNode sortedArrayToBST_2(int[] num) {
        if (num.length == 0) {
            return null;
        }
        TreeNode head = helper(num, 0, num.length - 1);
        return head;
    }

    public TreeNode helper(int[] num, int low, int high) {
        if (low > high) { // Done
            return null;
        }
        int mid = (low + high) / 2;
        TreeNode node = new TreeNode(num[mid]);
        node.left = helper(num, low, mid - 1);
        node.right = helper(num, mid + 1, high);
        return node;
    }
}
