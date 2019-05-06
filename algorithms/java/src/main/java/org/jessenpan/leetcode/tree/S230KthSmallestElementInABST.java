package org.jessenpan.leetcode.tree;

/**
 * @author jessenpan
 * tag:tree
 */
public class S230KthSmallestElementInABST {

    public static class TreeNode {

        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) { val = x; }
    }

    private int kthSmallest;

    private int index = 0;

    public int kthSmallest(TreeNode root, int k) {
        findKthSmallest(root, k);
        return kthSmallest;
    }

    private void findKthSmallest(TreeNode node, int k) {
        if (node == null || index == k) {
            return;
        }
        findKthSmallest(node.left, k);
        index++;
        if (k == index) {
            kthSmallest = node.val;
            return;
        }
        findKthSmallest(node.right, k);
    }
}
