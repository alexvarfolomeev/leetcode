package ru.company.leetcode_medium;

public class Solution {

    public static void main(String[] args) {
        var l1 = new ListNode(2, new ListNode(4, new ListNode(3)));
        var l2 = new ListNode(5, new ListNode(6, new ListNode(4)));

        var l3 = new ListNode(9, new ListNode(9, new ListNode(9, new ListNode(9, new ListNode(9, new ListNode(9, new ListNode(9)))))));
        var l4 = new ListNode(9, new ListNode(9, new ListNode(9, new ListNode(9))));
        //System.out.println(new Solution().addTwoNumbers(l1, l2));
        ListNode node = new Solution().addTwoNumbers(l3, l4);
        System.out.println(node);
        int[] nums = {-1, 0, 3, 5, 9, 12};
        System.out.println(search(nums, 9));

        System.out.println(new Solution().guessNumber(10));

    }

    public int guessNumber(int n) {
        var low = 1;
        var high = n;
        while(low <= high){
            var num = (low + high) / 2;
            if(num == 0) return num;
            if(num == -1) high = num; else low = num;
        }
        return 0;
    }
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        var head = new ListNode(0);
        var l3 = head;
        int carry = 0;
        while (l1 != null || l2 != null) {
            int l1_val = l1 != null ? l1.val : 0;
            int l2_val = l2 != null ? l2.val : 0;
            var sum = l1_val + l2_val + carry;
            carry = sum / 10;
            var last_digit = sum % 10;
            l3.next = new ListNode(last_digit);
            if (l1 != null) l1 = l1.next;
            if (l2 != null) l2 = l2.next;
            l3 = l3.next;
        }
        if (carry > 0){
            var node = new ListNode(carry);
            l3.next = node;
            l3 = l3.next;
        }
        return head.next;
    }

    public static int search(int[] nums, int target) {
        int low = 0;
        int high = nums.length - 1;
        while(low <= high){
            var middle = (low + high) / 2;
            if(nums[middle] == target){
                return middle;
            }
            if(nums[middle] > target){
                high = high - 1;
            } else{
                low = low + 1;
            }
        }
        return -1;
    }




    public static class ListNode {
      int val;
      ListNode next;
      ListNode() {
      }
      ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next;


      }
    }
}
