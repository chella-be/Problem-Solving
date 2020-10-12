package com.practice.leetcode.tree;

import com.practice.leetcode.data.TreeNode;

import java.util.LinkedList;
import java.util.Queue;

public class SumOfLeftLeaves {

    public int sumOfLeftLeaves(TreeNode root) {

        if(root == null) return 0;

        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        int sum = 0;
        while (!queue.isEmpty()) {
            TreeNode node = queue.poll();
            if (node.left != null) {
                if (node.left.left == null && node.left.right == null) {
                    sum += node.left.val;
                } else queue.offer(node.left);
            }
            if (node.right != null) {
                if (node.right.left != null || node.right.right != null) {
                    queue.offer(node.right);
                }
            }
        }

        return sum;
    }
}
