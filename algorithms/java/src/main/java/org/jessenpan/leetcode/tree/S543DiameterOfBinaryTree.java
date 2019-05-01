package org.jessenpan.leetcode.tree;

/**
 * @author jessenpan
 * tag:tree
 */
public class S543DiameterOfBinaryTree {

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

    private int maxDiameter = 0;

    public int diameterOfBinaryTree(TreeNode root) {
        calDiameterOfBinaryTree(root);
        return maxDiameter;
    }

    private int calDiameterOfBinaryTree(TreeNode node) {
        if (node == null) {
            return 0;
        }
        int leftLen = calDiameterOfBinaryTree(node.left);
        int rightLen = calDiameterOfBinaryTree(node.right);
        int diameter = leftLen + rightLen;
        if (diameter > this.maxDiameter) {
            this.maxDiameter = diameter;
        }
        return Math.max(leftLen, rightLen) + 1;
    }

}
