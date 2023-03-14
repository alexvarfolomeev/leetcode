package ru.company.leetcode_easy;

public class AddTwoNumbers {
    public static void main(String[] args) {
        //l1 = [2,4,3], l2 = [5,6,4]
        ListNode l1 = new ListNode(2, new ListNode(4, new ListNode(3)));
        ListNode l2 = new ListNode(5, new ListNode(6, new ListNode(4)));
        new AddTwoNumbers().addTwoNumbers(l1, l2);
    }

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        var head = new ListNode();
        var l3 = head;
        var carry = 0;
        while(l1 != null || l2 != null){
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
}
