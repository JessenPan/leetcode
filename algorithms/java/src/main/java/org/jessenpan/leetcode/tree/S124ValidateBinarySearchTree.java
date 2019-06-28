package org.jessenpan.leetcode.tree;

/**
 * @author jessenpan
 * tag:tree
 */
public class S124ValidateBinarySearchTree {

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

    public boolean isValidBST(TreeNode root) {
        if (root == null) {
            return true;
        }
        lastElement = null;
        try {
            doValidBST(root);
        } catch (Exception e) {
            return false;
        }
        return true;
    }

    private Integer lastElement = null;

    private void doValidBST(TreeNode node) {

        if (node == null) {
            return;
        }

        doValidBST(node.left);

        if (lastElement == null) {
            lastElement = node.val;
        } else {
            if (lastElement >= node.val) {
                throw new RuntimeException();
            } else {
                lastElement = node.val;
            }
        }
        doValidBST(node.right);

    }

}
