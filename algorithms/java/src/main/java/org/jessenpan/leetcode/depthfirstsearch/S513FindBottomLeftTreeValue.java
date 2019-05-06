package org.jessenpan.leetcode.depthfirstsearch;

import java.util.LinkedList;
import java.util.Queue;

/**
 * @author jessenpan
 * tag:depthFirstSearch
 */
public class S513FindBottomLeftTreeValue {

    public static class TreeNode {

        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) { val = x; }
    }

    public int findBottomLeftValue(TreeNode root) {

        int bottomLeftValue = 0;
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        while (!queue.isEmpty()) {

            bottomLeftValue = queue.peek().val;
            Queue<TreeNode> nextLevel = new LinkedList<>();
            while (!queue.isEmpty()) {
                TreeNode node = queue.poll();
                if (node.left != null) {
                    nextLevel.offer(node.left);
                }
                if (node.right != null) {
                    nextLevel.offer(node.right);
                }
            }
            queue = nextLevel;
        }
        return bottomLeftValue;
    }
}
