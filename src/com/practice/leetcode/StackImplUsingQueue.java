package com.practice.leetcode;

import java.util.Deque;
import java.util.LinkedList;

public class StackImplUsingQueue {

    private Deque<Integer> deque;

    /**
     * Initialize your data structure here.
     */
    public StackImplUsingQueue() {
        deque = new LinkedList<>();
    }

    /**
     * Push element x onto stack.
     */
    public void push(int x) {
        deque.push(x);
    }

    /**
     * Removes the element on top of the stack and returns that element.
     */
    public int pop() {
        return deque.removeLast();
    }

    /**
     * Get the top element.
     */
    public int top() {
        return deque.getLast();
    }

    /**
     * Returns whether the stack is empty.
     */
    public boolean empty() {
        return deque.isEmpty();
    }

}
