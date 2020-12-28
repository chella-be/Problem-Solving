package com.practice.free;

import com.practice.leetcode.data.TreeNode;

import java.util.LinkedList;
import java.util.Queue;

public class LevelDifference {

    /**
     * Given a a Binary Tree, find the difference between the sum of nodes at odd level and the sum of nodes at even level.
     * Consider root as level 1, left and right children of root as level 2 and so on. For example, in the following tree,
     * sum of nodes at odd level is (5 + 1 + 4 + 8) which is 18. And sum of nodes at even level is (2 + 6 + 3 + 7 + 9)
     * which is 27. The output for following tree should be 18 – 27 which is -9.
     *
     * @param root Root node
     * @return level difference value
     */
    public int levelDifference(TreeNode root) {

        if (null == root) return 0;

        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        int oddSum = 0;
        int evenSum = 0;
        int level = 1;
        while (!queue.isEmpty()) {
            int size = queue.size();
            for (int i = 0; i < size; i++) {
                TreeNode node = queue.poll();
                if (level % 2 == 0) {
                    evenSum += node.val;
                } else {
                    oddSum += node.val;
                }
                if (null != node.left) queue.offer(node.left);
                if (null != node.right) queue.offer(node.right);
            }
            level++;
        }

        return oddSum - evenSum;
    }
}
