package org.jessenpan.leetcode.tree;

/**
 * @author jessenpan
 * tag:tree
 */
public class S687LongestUnivaluePath {

    public static class TreeNode {

        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) { val = x; }
    }

    private int maxLength = 0;

    public int longestUnivaluePath(TreeNode root) {
        if (root == null) {
            return 0;
        }
        findMax(root, root.val);
        return maxLength;
    }

    private int findMax(TreeNode node, int val) {
        if (node == null) {
            return 0;
        }
        int left = findMax(node.left, node.val);
        int right = findMax(node.right, node.val);
        maxLength = Math.max(maxLength, left + right);
        if (node.val == val) {
            return Math.max(left, right) + 1;
        }
        return 0;
    }

}
