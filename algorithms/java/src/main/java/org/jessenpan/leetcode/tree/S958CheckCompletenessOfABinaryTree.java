package org.jessenpan.leetcode.tree;

import java.util.*;

/**
 * @author jessenpan
 * tag:dfs
 */
public class S958CheckCompletenessOfABinaryTree {

    public static class TreeNode {

        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) { val = x; }

        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }

    private final TreeNode NULL_NODE = new TreeNode(-1);

    int MAX_LEVEL = -1;
    int allNodeSum = 0;

    public boolean isCompleteTree(TreeNode root) {
        if (root == null) {
            return true;
        }
        calcLevel(root, 1);
        if (allNodeSum == Math.pow(2, MAX_LEVEL) - 1) {
            return true;
        }
        int level = 1, sum = 0;
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        while (!queue.isEmpty()) {
            sum = 0;
            Queue<TreeNode> nextLevel = new LinkedList<>();
            while (!queue.isEmpty()) {
                TreeNode node = queue.poll();
                sum++;
                if (node.left != null) {
                    nextLevel.offer(node.left);
                } else if (level == (MAX_LEVEL - 1)) {
                    nextLevel.offer(NULL_NODE);
                }
                if (node.right != null) {
                    nextLevel.offer(node.right);
                } else if (level == (MAX_LEVEL - 1)) {
                    nextLevel.offer(NULL_NODE);
                }
            }
            queue = nextLevel;
            if (level <= (MAX_LEVEL - 1) && sum != Math.pow(2, level - 1)) {
                return false;
            }
            level++;
            if (level == MAX_LEVEL) {
                break;
            }
        }
        if (queue.isEmpty()) {
            return true;
        }
        boolean hasNULL = false;
        while (!queue.isEmpty()) {
            TreeNode node = queue.poll();
            if (node == NULL_NODE) {
                hasNULL = true;
            } else if (hasNULL) {
                return false;
            }
        }
        return true;
    }

    private void calcLevel(TreeNode node, int current) {

        allNodeSum++;
        if (node.left == null && node.right == null) {
            MAX_LEVEL = Math.max(current, MAX_LEVEL);
        }
        if (node.left != null) {
            calcLevel(node.left, current + 1);
        }
        if (node.right != null) {
            calcLevel(node.right, current + 1);
        }
    }

}
