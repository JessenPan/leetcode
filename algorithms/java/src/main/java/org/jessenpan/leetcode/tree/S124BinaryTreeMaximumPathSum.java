package org.jessenpan.leetcode.tree;

/**
 * @author jessenpan
 * tag:tree
 */
public class S124BinaryTreeMaximumPathSum {

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

    private int max = Integer.MIN_VALUE;

    public int maxPathSum(TreeNode root) {
        if (root == null) {
            return 0;
        }
        findMaxPathSum(root);
        return max;
    }

    public int findMaxPathSum(TreeNode root) {
        if (root == null) {
            return 0;
        }

        int leftMax = 0;
        if (root.left != null) {
            leftMax = findMaxPathSum(root.left);
            max = Math.max(max, leftMax);
            max = Math.max(max, leftMax + root.val);
        }
        int rightMax = 0;
        if (root.right != null) {
            rightMax = findMaxPathSum(root.right);
            max = Math.max(max, rightMax);
            max = Math.max(max, rightMax + root.val);
        }

        max = Math.max(max, root.val);
        max = Math.max(max, leftMax + rightMax + root.val);

        return Math.max(Math.max(root.val, root.val + leftMax), root.val + rightMax);
    }
}
