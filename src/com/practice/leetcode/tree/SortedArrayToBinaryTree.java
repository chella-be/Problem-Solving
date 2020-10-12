package com.practice.leetcode.tree;

public class SortedArrayToBinaryTree {

    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }

    public TreeNode sortedArrayToBST(int[] nums) {
        if (nums.length == 0) {
            return null;
        }
        return constructBinaryTree(nums, 0, nums.length - 1);
    }

    private TreeNode constructBinaryTree(int[] nums, int left, int right) {

        if (left > right) return null;
        int mid = left + (right - left) / 2;
        TreeNode node = new TreeNode(nums[mid]);
        node.left = constructBinaryTree(nums, left, mid - 1);
        node.right = constructBinaryTree(nums, mid + 1, right);
        return node;
    }
}
