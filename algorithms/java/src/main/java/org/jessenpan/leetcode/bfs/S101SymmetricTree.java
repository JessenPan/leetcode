package org.jessenpan.leetcode.bfs;

/**
 * @author jessenpan
 * tag:tree
 */
public class S101SymmetricTree {

    public static class TreeNode {

        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) { val = x; }
    }

    public boolean isSymmetric(TreeNode root) {
        if (root == null) {
            return true;
        }
        return isSameTree(root.left, root.right);
    }

    public boolean isSameTree(TreeNode node1, TreeNode node2) {
        if (node1 == null && node2 == null) {
            return true;
        }
        if (node1 == null || node2 == null) {
            return false;
        }
        if (node1.val != node2.val) {
            return false;
        }
        if (!isSameTree(node1.left, node2.right)) {
            return false;
        }
        return isSameTree(node1.right, node2.left);
    }
}
