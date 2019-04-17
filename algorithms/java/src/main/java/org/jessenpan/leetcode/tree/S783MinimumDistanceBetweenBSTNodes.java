package org.jessenpan.leetcode.tree;

/**
 * @author jessenpan
 * tag:tree
 */
public class S783MinimumDistanceBetweenBSTNodes {

    public static class TreeNode {

        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            this.val = x;
        }
    }

    private int preVal = -1;

    private int distance = -1;

    public int minDiffInBST(TreeNode root) {
        findMinDiff(root);
        return distance;
    }

    private void findMinDiff(TreeNode node) {
        if (node == null) {
            return;
        }
        findMinDiff(node.left);
        if (distance == -1 && preVal == -1) {
            preVal = node.val;
        } else if (distance == -1) {
            distance = node.val - preVal;
            preVal = node.val;
        } else {
            if (node.val - preVal < distance) {
                distance = node.val - preVal;
            }
            preVal = node.val;
        }
        findMinDiff(node.right);
    }

}
