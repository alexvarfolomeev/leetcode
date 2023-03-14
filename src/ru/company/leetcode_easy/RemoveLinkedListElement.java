package ru.company.leetcode_easy;

public class RemoveLinkedListElement {

    public static void main(String[] args) {
        ListNode node = new ListNode(1, new ListNode(2, new ListNode(6, new ListNode(3, new ListNode(4, new ListNode(5, new ListNode(6)))))));
        ListNode test_2 = new ListNode(7, new ListNode(7, new ListNode(7, new ListNode(7))));
        new RemoveLinkedListElement().removeElements(node, 6);
        new RemoveLinkedListElement().removeElements(test_2, 7);
    }

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
