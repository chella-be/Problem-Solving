package com.practice.leetcode.tree;

import com.practice.leetcode.data.TreeNode;

import java.util.ArrayList;
import java.util.List;

public class BinaryTreePaths {

    /**
     * Given a binary tree, return all root-to-leaf paths.
     * <p>
     * Note: A leaf is a node with no children.
     */
    public List<String> binaryTreePaths(TreeNode root) {

        List<String> result = new ArrayList<>();
        if (root == null) {
            return result;
        }

        inorderDFS(root, result, "");

        return result;
    }

    private void inorderDFS(TreeNode node, List<String> result, String path) {
        path += node.val;

        if (node.left == null && node.right == null) {
            result.add(path);
            return;
        }

        if (node.left != null) inorderDFS(node.left, result, path + "->");
        if (node.right != null) inorderDFS(node.right, result, path + "->");
    }
}
