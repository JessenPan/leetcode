package org.jessenpan.leetcode.tree;

/**
 * @author jessenpan
 * tag:tree
 */
public class S129SumRootToLeafNumbers {

    public static class TreeNode {

        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) { val = x; }
    }

    private int sum = 0;

    public int sumNumbers(TreeNode root) {
        calNumbers(root, 0);
        return sum;
    }

    private void calNumbers(TreeNode node, int currentSum) {
        if (node == null) {
            return;
        }
        currentSum = currentSum * 10 + node.val;
        if (node.left == null && node.right == null) {
            sum += currentSum;
        }
        calNumbers(node.left, currentSum);
        calNumbers(node.right, currentSum);
    }

}
