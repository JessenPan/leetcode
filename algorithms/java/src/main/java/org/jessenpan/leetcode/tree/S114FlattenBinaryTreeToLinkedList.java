package org.jessenpan.leetcode.tree;

/**
 * @author jessenpan
 * tag:tree
 */
public class S114FlattenBinaryTreeToLinkedList {

    public static class TreeNode {

        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) { val = x; }
    }

    private TreeNode pre;

    public void flatten(TreeNode node) {
        if (node == null) {
            return;
        }
        TreeNode left = node.left;
        TreeNode right = node.right;
        node.left = null;
        node.right = null;
        if (pre == null) {
            pre = node;
        } else {
            pre.right = node;
            pre = node;
        }
        flatten(left);
        flatten(right);

    }
}
