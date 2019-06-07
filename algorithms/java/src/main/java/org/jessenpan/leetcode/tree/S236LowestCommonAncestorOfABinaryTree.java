package org.jessenpan.leetcode.tree;

/**
 * @author jessenpan
 * tag:tree
 */
public class S236LowestCommonAncestorOfABinaryTree {

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

    private TreeNode ancestor = null;

    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        findAncestor(root, p, q);
        return ancestor;
    }

    private boolean findAncestor(TreeNode node, TreeNode p, TreeNode q) {
        if (ancestor != null || node == null) {
            return false;
        }
        boolean isLeftMatch = findAncestor(node.left, p, q);
        boolean isRightMatch = findAncestor(node.right, p, q);
        if ((node.val == p.val || node.val == q.val) && (isLeftMatch || isRightMatch)) {
            ancestor = node;
            return false;
        }
        if (isLeftMatch && isRightMatch) {
            ancestor = node;
            return false;
        }
        return node.val == q.val || node.val == p.val || (isLeftMatch || isRightMatch);
    }

}
