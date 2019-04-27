package org.jessenpan.leetcode.tree;

/**
 * @author jessenpan
 * tag:tree
 */
public class S938RangeSumOfBST {

    public class TreeNode {

        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) { val = x; }
    }

    private int sum = 0;

    public int rangeSumBST(TreeNode root, int l, int r) {
        sumBST(root, l, r);
        return sum;
    }

    private void sumBST(TreeNode node, int l, int r) {

        if (node == null) {
            return;
        }

        if (node.val >= l && node.val <= r) {
            sumBST(node.left, l, r);
            sum += node.val;
            sumBST(node.right, l, r);
            return;
        }

        if (node.val < l) {
            sumBST(node.right, l, r);
            return;
        }

        sumBST(node.left, l, r);
    }
}
