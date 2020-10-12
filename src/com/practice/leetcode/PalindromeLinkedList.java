package com.practice.leetcode;

import com.practice.leetcode.data.ListNode;

public class PalindromeLinkedList {

    public boolean isPalindrome(ListNode head) {

        ListNode fast = head;
        ListNode slow = head;
        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
        }

        slow = reverseList(slow);
        fast = head;

        while (slow != null) {
            if (slow.val != fast.val) return false;
            slow = slow.next;
            fast = fast.next;
        }

        return true;
    }

    private ListNode reverseList(ListNode node) {

        ListNode prev = null;
        ListNode current = node;
        while (current != null) {
            ListNode next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }

        return prev;
    }
}
