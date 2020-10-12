package com.practice.leetcode.tree;

import com.practice.leetcode.data.TreeNode;

public class BalancedBinaryTree {

    public boolean isBalanced(TreeNode root) {
        return Math.abs(height(root.left) - height(root.right)) <= 1;
    }

    private int height(TreeNode node) {

        if (node == null) {
            return -1;
        }

        int lHeight = height(node.left);
        if (lHeight == -1) return -1;
        int rHeight = height(node.right);
        if (rHeight == -1) return -1;

        if (Math.abs(lHeight - rHeight) > 1) return -1;

        return Math.max(lHeight, rHeight) + 1;
    }
}
