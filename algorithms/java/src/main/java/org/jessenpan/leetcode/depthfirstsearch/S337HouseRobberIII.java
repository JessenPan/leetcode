package org.jessenpan.leetcode.depthfirstsearch;

import java.util.*;

/**
 * @author jessenpan
 * tag:depthFirstSearch
 */
public class S337HouseRobberIII {

    public static class TreeNode {

        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) { val = x; }
    }

    public int rob(TreeNode root) {

        if (root == null) {
            return 0;
        }
        int oddSum = 0, evenSum = 0;
        int level = 1;
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        while (!queue.isEmpty()) {
            Queue<TreeNode> nextLevel = new LinkedList<>();
            while (!queue.isEmpty()) {
                TreeNode node = queue.poll();
                if ((level & 1) == 1) {
                    oddSum += node.val;
                } else {
                    evenSum += node.val;
                }
                if (node.left != null) {
                    nextLevel.offer(node.left);
                }
                if (node.right != null) {
                    nextLevel.offer(node.right);
                }
            }
            level++;
            queue = nextLevel;
        }
        return Math.max(oddSum, evenSum);
    }

}
