package org.jessenpan.leetcode.tree;

/**
 * @author jessenpan
 * tag:tree
 */
public class S437PathSumIII {

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

    private int sum = 0;
    private int count = 0;

    public int pathSum(TreeNode root, int sum) {
        this.sum = sum;
        findPathSum(root);
        return count;
    }

    private void findPathSum(TreeNode node) {
        if (node == null) {
            return;
        }

        if (node.val == sum) {
            count++;
        }
        count(node.left, node.val);
        count(node.right, node.val);
        findPathSum(node.left);
        findPathSum(node.right);
    }

    private void count(TreeNode node, int tmpSum) {
        if (node == null) {
            return;
        }
        int newTmpSum = node.val + tmpSum;
        if (newTmpSum == sum) {
            count++;
        }

        if (node.left != null) {
            count(node.left, newTmpSum);
        }
        if (node.right != null) {
            count(node.right, newTmpSum);
        }
    }

}
