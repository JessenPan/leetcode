package org.jessenpan.leetcode.tree;

/**
 * @author jessenpan
 * tag:tree
 */
public class S669TrimABinarySearchTree {

    public static class TreeNode {

        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) { val = x; }
    }

    public TreeNode trimBST(TreeNode root, int l, int r) {
        if (root == null) {
            return null;
        }
        if (root.val < l) {
            return trimBST(root.right, l, r);
        }
        if (root.val > r) {
            return trimBST(root.left, l, r);
        }
        root.left = trimBST(root.left, l, r);
        root.right = trimBST(root.right, l, r);
        return root;
    }

}
