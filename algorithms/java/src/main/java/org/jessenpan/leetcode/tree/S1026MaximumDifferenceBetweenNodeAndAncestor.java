package org.jessenpan.leetcode.tree;

/**
 * @author jessenpan
 * tag:tree
 */
public class S1026MaximumDifferenceBetweenNodeAndAncestor {

    public static class TreeNode {

        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) { val = x; }
    }

    private int theMax = 0;

    public int maxAncestorDiff(TreeNode root) {
        findDiff(root);
        return theMax;
    }

    private void findDiff(TreeNode node) {
        if (node == null) {
            return;
        }

        calDiff(node.left, node);
        calDiff(node.right, node);
        findDiff(node.left);
        findDiff(node.right);
    }

    private void calDiff(TreeNode node, TreeNode ancestor) {
        if (node == null) {
            return;
        }
        theMax = Math.max(theMax, Math.abs(ancestor.val - node.val));
        calDiff(node.left, ancestor);
        calDiff(node.right, ancestor);
    }

}
