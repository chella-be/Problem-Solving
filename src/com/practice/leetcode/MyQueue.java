package com.practice.leetcode;

import java.util.Stack;

public class MyQueue {

    private Stack<Integer> enqueue;
    private Stack<Integer> dequeue;

    /**
     * Initialize your data structure here.
     */
    public MyQueue() {
        enqueue = new Stack<>();
        dequeue = new Stack<>();
    }

    /**
     * Push element x to the back of queue.
     */
    public void push(int x) {
        enqueue.push(x);
    }

    /**
     * Removes the element from in front of queue and returns that element.
     */
    public int pop() {
        if (dequeue.isEmpty()) {
            fillDequeue();
        }

        return dequeue.pop();
    }

    private void fillDequeue() {
        while (!enqueue.isEmpty()) {
            dequeue.push(enqueue.pop());
        }
    }

    /**
     * Get the front element.
     */
    public int peek() {
        if (dequeue.isEmpty()) {
            fillDequeue();
        }
        return dequeue.peek();
    }

    /**
     * Returns whether the queue is empty.
     */
    public boolean empty() {
        return enqueue.isEmpty() && dequeue.isEmpty();
    }
}
