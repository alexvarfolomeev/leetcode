package ru.company.leetcode_easy;

public class ReverseLinkedList {
    public static void main(String[] args) {
        //[1,2,3,4,5]
        ListNode testNode =
                new ListNode(1,
                    new ListNode(2,
                        new ListNode(3,
                                new ListNode(4,
                                        new ListNode(5)))));

        System.out.println(reverseList(testNode));
    }

    public static ListNode reverseList(ListNode head) {
        ListNode prev = null;
        while(head != null){
            ListNode next = head.next;
            head.next = prev;
            prev = head;
            head = next;
        }
        return prev;
    }
}
