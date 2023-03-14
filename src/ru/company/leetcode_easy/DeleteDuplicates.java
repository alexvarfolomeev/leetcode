package ru.company.leetcode_easy;

import ru.company.leetcode_medium.Solution;

import java.util.List;

public class DeleteDuplicates {

    public static void main(String[] args) {
        var test = new ListNode(1, new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(3)))));
        var res = new DeleteDuplicates().deleteDuplicates(test);
    }

    public ListNode deleteDuplicates(ListNode head) {
        var current = head;
        while (current.next != null){
            if (current.val == current.next.val){
                current.next = current.next.next;
            } else {
                current = current.next;
            }
        }
        return head;
    }


    public static class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }
}
