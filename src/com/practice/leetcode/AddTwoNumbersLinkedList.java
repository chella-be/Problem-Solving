package com.practice.leetcode;

import com.practice.leetcode.data.ListNode;

public class AddTwoNumbersLinkedList {

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {

        int result = 0;
        int remain = 0;
        ListNode res = null;
        ListNode head = null;
        while (l1 != null && l2 != null) {
            result = remain + l1.val + l2.val;
            remain = result % 10;
            result = result/10;

            if (res == null) {
                res = new ListNode(result);
                res.next = null;
                head = res;
            } else {
                res.next = new ListNode(result);
                res = res.next;
            }

            l1 = l1.next;
            l2 = l2.next;
        }

        while (l1 != null) {
            result = l1.val + remain;
            remain = result % 10;
            result = result/10;
            res.next = new ListNode(result);
            res = res.next;
            l1 = l1.next;
        }
        while (l2 != null) {
            result = l2.val + remain;
            remain = result % 10;
            result = result/10;
            res.next = new ListNode(result);
            res = res.next;
            l2 = l2.next;
        }

        if (remain > 0) {
            res.next = new ListNode(remain);
            res = res.next;
        }
        return head;
    }

    public ListNode addTwoNumbers1(ListNode l1, ListNode l2) {

        int remain = 0;
        ListNode head = new ListNode(0);
        ListNode res = head;
        while (l1 != null || l2 != null) {

            int num1 = l1 != null ? l1.val : 0;
            int num2 = l2 != null ? l2.val : 0;
            int sum = num1 + num2 + remain;

            remain = sum / 10;
            sum = sum % 10;

            res.next = new ListNode(sum);
            res = res.next;

            if (l1 != null) {
                l1 = l1.next;
            }
            if (l2 != null) {
                l2 = l2.next;
            }
        }

        if (remain > 0) {
            res.next = new ListNode(remain);
            res = res.next;
        }

        return head.next;
    }
}
