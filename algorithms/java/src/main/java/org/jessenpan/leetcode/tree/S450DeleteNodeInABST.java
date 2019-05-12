package org.jessenpan.leetcode.tree;

/**
 * @author jessenpan
 * tag:tree
 */
public class S450DeleteNodeInABST {

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

    private TreeNode deletedNode;

    private TreeNode nextNode;

    private int deleteVal;

    private boolean hasDeleted = false;

    public TreeNode deleteNode(TreeNode root, int key) {
        this.deleteVal = key;
        deleteNode(root);
        if (root.val == key) {
            return nextNode;
        } else {
            return root;
        }
    }

    private TreeNode deleteNode(TreeNode node) {
        if (node == null || hasDeleted) {
            return node;
        }
        if (node.val != deleteVal) {
            node.left = deleteNode(node.left);
        }
        if (node.val == deleteVal) {
            if (node.right == null) {
                return node.left;
            } else {
                deletedNode = node;
            }
        } else if (deletedNode != null && nextNode == null) {
            deletedNode.val = node.val;
            nextNode = node;
            if (node.left == null) {
                deletedNode.right = node.right;
            }
            hasDeleted = true;
        } else if (nextNode != null && node.left != null && node.left.val == nextNode.val) {
            nextNode.left = null;
        }
        node.right = deleteNode(node.right);
        return node;
    }

}
