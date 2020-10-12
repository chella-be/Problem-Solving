package com.practice.leetcode;

import com.practice.leetcode.data.ListNode;

public class ReverseLinkedList {

    public ListNode reverseList(ListNode head) {

        ListNode next;
        ListNode prev = null;
        ListNode current = head;

        while (current != null) {
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        head = prev;

        return head;
    }
}
