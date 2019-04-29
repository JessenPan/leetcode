package org.jessenpan.leetcode.tree;

/**
 * @author jessenpan
 * tag:tree
 */
public class S563BinaryTreeTilt {

    public static class TreeNode {

        int val;
        TreeNode left;
        TreeNode right;

        public TreeNode(int x) { val = x; }

        public TreeNode(int x, TreeNode left, TreeNode right) {
            this.val = x;
            this.left = left;
            this.right = right;
        }

    }

    private int sum;

    public int findTilt(TreeNode root) {
        calTilt(root);
        return sum;
    }

    private int calTilt(TreeNode node) {
        if (node == null) {
            return 0;
        }
        int left = calTilt(node.left);
        int right = calTilt(node.right);
        sum += Math.abs(left - right);
        return left + right + node.val;
    }

}
