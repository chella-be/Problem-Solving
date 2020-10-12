package com.practice.leetcode.tree;

import java.util.LinkedList;
import java.util.Queue;

public class SymmetricTree {

    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }

    public boolean isSymmetric(TreeNode root) {

        if (root == null) {
            return true;
        }

        Queue<TreeNode> queue1 = new LinkedList<>();
        Queue<TreeNode> queue2 = new LinkedList<>();
        queue1.offer(root.left);
        queue2.offer(root.right);

        while (!queue1.isEmpty() && !queue2.isEmpty()) {
            TreeNode node1 = queue1.poll();
            TreeNode node2 = queue2.poll();

            if ((node1 == null && node2 != null) || (node1 != null && node2 == null)) {
                return false;
            }

            if (node1 != null) {
                if (node1.val != node2.val) {
                    return false;
                }

                queue1.offer(node1.left);
                queue1.offer(node1.right);
                queue2.offer(node2.right);
                queue2.offer(node2.left);
            }
        }

        return true;
    }
}
