package org.jessenpan.leetcode;

/**
 * @author jessenpan
 * tag:tree
 */
public class S671SecondMinimumNodeInABinaryTree {

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

    private static final Integer NO_SECOND_MIN_SYMBOL = -1;

    private Integer theMin = NO_SECOND_MIN_SYMBOL;

    private Integer theSecondMin = NO_SECOND_MIN_SYMBOL;

    public int findSecondMinimumValue(TreeNode root) {
        if (root == null) {
            return NO_SECOND_MIN_SYMBOL;
        }
        traverseTree(root);
        return theSecondMin == root.val ? NO_SECOND_MIN_SYMBOL : theSecondMin;
    }

    private void traverseTree(TreeNode node) {
        if (node == null) {
            return;
        }

        if (theMin.equals(NO_SECOND_MIN_SYMBOL)) {
            theMin = node.val;
        } else if (theSecondMin.equals(NO_SECOND_MIN_SYMBOL) && node.val > theMin) {
            theSecondMin = node.val;
        } else if (!theSecondMin.equals(NO_SECOND_MIN_SYMBOL)) {
            if (node.val <= theMin) {
                theMin = node.val;
            } else if (node.val < theSecondMin) {
                theSecondMin = node.val;
            }
        }

        traverseTree(node.left);
        traverseTree(node.right);
    }
}
