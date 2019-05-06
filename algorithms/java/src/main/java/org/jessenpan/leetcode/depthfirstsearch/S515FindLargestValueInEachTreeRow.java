package org.jessenpan.leetcode.depthfirstsearch;

import java.util.*;

/**
 * @author jessenpan
 * tag:depthFirstSearch
 */
public class S515FindLargestValueInEachTreeRow {

    public static class TreeNode {

        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) { val = x; }
    }

    public List<Integer> largestValues(TreeNode root) {
        if (root == null) {
            return Collections.emptyList();
        }
        List<Integer> largestValues = new ArrayList<>();
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        int max;
        while (!queue.isEmpty()) {

            max = queue.peek().val;
            Queue<TreeNode> nextLevel = new LinkedList<>();
            while (!queue.isEmpty()) {
                TreeNode node = queue.poll();
                max = Math.max(node.val, max);
                if (node.right != null) {
                    nextLevel.offer(node.right);
                }
                if (node.left != null) {
                    nextLevel.offer(node.left);
                }
            }
            largestValues.add(max);
            queue = nextLevel;
        }
        return largestValues;
    }
}
