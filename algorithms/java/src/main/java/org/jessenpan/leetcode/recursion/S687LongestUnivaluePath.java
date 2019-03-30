package org.jessenpan.leetcode.recursion;

/**
 * @author jessenpan
 * tag:recursion
 */
public class S687LongestUnivaluePath {

    public static class TreeNode {

        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) { val = x; }

        TreeNode(int x, TreeNode left, TreeNode right) {
            this.val = x;
            this.left = left;
            this.right = right;
        }
    }

    private int maxPath = 0;

    public int longestUnivaluePath(TreeNode root) {
        if (root == null) {
            return 0;
        }
        sumPath(root, null, 0);
        return maxPath;
    }

    private void sumPath(TreeNode node, TreeNode parent, int path) {
        if (node == null) {
            return;
        }
        int newPath = path;
        if (parent != null && parent.val == node.val) {
            newPath++;
        } else {
            if (newPath > this.maxPath) {
                this.maxPath = newPath;
            }
            newPath = 0;
        }
        sumPath(node.left, node, newPath);
        sumPath(node.right, node, newPath);
    }
}
