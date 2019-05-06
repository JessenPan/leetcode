package org.jessenpan.leetcode.depthfirstsearch;

import java.util.*;

/**
 * @author jessenpan
 * tag:tree
 */
public class S199BinaryTreeRightSideView {

    public static class TreeNode {

        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) { val = x; }
    }

    public List<Integer> rightSideView(TreeNode root) {
        if (root == null) {
            return Collections.emptyList();
        }
        List<Integer> rightSides = new ArrayList<>();
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        while (!queue.isEmpty()) {

            rightSides.add(queue.peek().val);
            Queue<TreeNode> nextLevel = new LinkedList<>();
            while (!queue.isEmpty()) {
                TreeNode node = queue.poll();
                if (node.right != null) {
                    nextLevel.offer(node.right);
                }
                if (node.left != null) {
                    nextLevel.offer(node.left);
                }
            }
            queue = nextLevel;
        }
        return rightSides;
    }

}
