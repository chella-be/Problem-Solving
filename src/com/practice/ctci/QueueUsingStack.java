package com.practice.ctci;

import java.util.Stack;

//3.4
public class QueueUsingStack {

    Stack<Integer> stack1 = new Stack<>();
    Stack<Integer> stack2 = new Stack<>();

    public void push(int num) {
        stack1.push(num);
    }

    public int pop() {
        fill();
        return stack2.pop();
    }

    private void fill() {
        if (stack2.isEmpty()) {
            while (!stack1.isEmpty()) {
                stack2.push(stack1.pop());
            }
        }
    }

    public int peek() {
        if (stack2.isEmpty()) {
            fill();
        }
        return stack2.peek();
    }

    public boolean isEmpty() {
        return stack1.isEmpty() && stack2.isEmpty();
    }

    public int size() {
        return stack2.size() + stack1.size();
    }
}
