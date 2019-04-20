package org.jessenpan.leetcode.tree;

/**
 * @author jessenpan
 * tag:tree
 */
public class S110BalancedBinaryTree {

    public static class TreeNode {

        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) { val = x; }
    }

    private boolean isBalanced = true;

    public boolean isBalanced(TreeNode root) {
        if (root == null) {
            return true;
        }
        computeHeight(root);
        return isBalanced;
    }

    private int computeHeight(TreeNode node) {
        if (node == null) {
            return 0;
        }
        int leftHeight = computeHeight(node.left);
        int rightHeight = computeHeight(node.right);
        if (Math.abs(leftHeight - rightHeight) > 1) {
            isBalanced = false;
        }
        return Math.max(leftHeight, rightHeight) + 1;
    }

}
