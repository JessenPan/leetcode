package org.jessenpan.leetcode.tree;

/**
 * @author jessenpan
 * tag:tree
 */
public class S530MinimumAbsoluteDifferenceInBST {

    public static class TreeNode {

        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            this.val = x;
        }

        TreeNode(int x, TreeNode left, TreeNode right) {
            this.val = x;
            this.left = left;
            this.right = right;
        }
    }

    private int preVal = -1;

    private int minDiff = -1;

    public int getMinimumDifference(TreeNode root) {
        findMinDiff(root);
        return minDiff;
    }

    private void findMinDiff(TreeNode node) {
        if (node == null) {
            return;
        }
        findMinDiff(node.left);
        if (preVal == -1) {
            preVal = node.val;
        } else if (minDiff == -1) {
            minDiff = Math.abs(node.val - preVal);
            preVal = node.val;
        } else {
            if (Math.abs(node.val - preVal) < minDiff) {
                minDiff = Math.abs(node.val - preVal);
            }
            preVal = node.val;
        }
        findMinDiff(node.right);
    }

}
