package org.jessenpan.leetcode.tree;

/**
 * @author jessenpan
 * tag:tree
 */
public class S404SumOfLeftLeaves {

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

    private static final String LEFT_SYMBOL = "L";

    private static final String RIGHT_SYMBOL = "R";

    public int sumOfLeftLeaves(TreeNode root) {
        countLeftLeaves(root, RIGHT_SYMBOL);
        return sumOfLeftLeaves;
    }

    private void countLeftLeaves(TreeNode node, String positionSymbol) {
        if (node == null) {
            return;
        }

        if (node.left == null && node.right == null && LEFT_SYMBOL.equals(positionSymbol)) {
            sumOfLeftLeaves += node.val;
        }
        countLeftLeaves(node.left, LEFT_SYMBOL);
        countLeftLeaves(node.right, RIGHT_SYMBOL);
    }

    private int sumOfLeftLeaves = 0;
}
