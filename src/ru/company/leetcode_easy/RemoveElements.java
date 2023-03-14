package ru.company.leetcode_easy;

public class RemoveElements {
    public ListNode removeElements(ListNode head, int val) {
        ListNode temp = new ListNode(-1);
        temp.next = head;

        ListNode cur = head;
        ListNode prev = temp;

        while (cur != null) {
            if (cur.val == val) {
                prev.next = cur.next;
            } else {
                prev = cur;
            }
            cur = cur.next;
        }
        return temp.next;
    }
}
