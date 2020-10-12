package com.practice.leetcode;

import com.practice.leetcode.data.ListNode;

import java.util.HashSet;
import java.util.Set;

public class LinkedListIntersection {


    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        if (headA == null || headB == null) {
            return null;
        }
        Set<ListNode> first = new HashSet<>();
        while (headA != null) {
            first.add(headA);
            headA = headA.next;
        }

        while (headB != null) {
            if (first.contains(headB)) return headB;
            headB = headB.next;
        }

        return null;
    }
}
