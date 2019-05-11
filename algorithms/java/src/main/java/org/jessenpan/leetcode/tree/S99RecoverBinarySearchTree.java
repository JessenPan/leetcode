package org.jessenpan.leetcode.tree;

/**
 * @author jessenpan
 * tag:tree
 */
public class S99RecoverBinarySearchTree {

    public static class TreeNode {

        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) { val = x; }
    }

    private TreeNode left;

    private TreeNode right;

    private TreeNode pre;

    public void recoverTree(TreeNode root) {
        findMistakeNode(root);
        int tmp = left.val;
        left.val = right.val;
        right.val = tmp;
    }

    private void findMistakeNode(TreeNode node) {
        if (node == null) {
            return;
        }
        findMistakeNode(node.left);

        if (pre != null && pre.val > node.val) {
            if (left == null) {
                left = pre;
                right = node;
            } else {
                right = node;
                return;
            }
        }
        pre = node;
        findMistakeNode(node.right);
    }

}
