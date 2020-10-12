package com.practice.leetcode.tree;

import com.practice.leetcode.data.TreeNode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class LevelOrderBottom {

    public List<List<Integer>> levelOrderBottom(TreeNode root) {

        if (root == null){
            return new ArrayList<>();
        }

        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);

        List<List<Integer>> result = new ArrayList<>();

        while (!queue.isEmpty()){
            int levelLen = queue.size();
            List<Integer> innerList = new ArrayList<>();

            for (int i = 0 ; i <levelLen;i++){
                TreeNode node = queue.poll();
                if (node.left != null) {
                    queue.offer(node.left);
                }
                if (node.right!=null){
                    queue.offer(node.right);
                }
                innerList.add(node.val);
            }
            result.add(0,innerList);
        }

        return result;
    }
}
