package org.jessenpan.leetcode.tree;

/**
 * @author jessenpan
 * tag:tree
 */
public class S235LowestCommonAncestorOfABinarySearchTree {

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

    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        int l = Math.min(p.val, q.val), r = Math.max(p.val, q.val);
        findAncestor(root, l, r);
        return ancestor;
    }

    private void findAncestor(TreeNode node, int l, int r) {
        if (found || node == null) {
            return;
        }
        if (node.val >= l && node.val <= r) {
            found = true;
            ancestor = node;
            return;
        }

        if (r < node.val) {
            findAncestor(node.left, l, r);
            return;
        }

        findAncestor(node.right, l, r);
    }

    private TreeNode ancestor;

    private boolean found = false;

}
