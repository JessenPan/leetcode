package org.jessenpan.leetcode.tree;

/**
 * @author jessenpan
 * tag:tree
 */
public class S1022SumOfRootToLeafBinaryNumbers {

    public static class TreeNode {

        int val;
        TreeNode left;
        TreeNode right;
    }

    private static int MAX = (int) (Math.pow(10, 9) + 7);

    private long sum = 0;

    public int sumRootToLeaf(TreeNode root) {
        calLeaf(root, 0);
        return (int) sum;
    }

    private void calLeaf(TreeNode node, int curSum) {
        if (node == null) {
            return;
        }

        int newSum = (curSum << 1) + node.val;
        if (node.left == null && node.right == null) {
            sum += newSum;
            sum = sum >= MAX ? (sum % MAX) : sum;
        }
        calLeaf(node.left, newSum);
        calLeaf(node.right, newSum);
    }

}
