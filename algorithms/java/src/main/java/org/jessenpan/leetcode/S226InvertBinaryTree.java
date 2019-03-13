package org.jessenpan.leetcode;

/**
 * @author jessenpan
 * tag:tree,stack
 * //TODO use stack to implement
 */
public class S226InvertBinaryTree {

    public class TreeNode {

        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) { val = x; }

        public TreeNode getLeft() {
            return left;
        }

        public void setLeft(TreeNode left) {
            this.left = left;
        }

        public TreeNode getRight() {
            return right;
        }

        public void setRight(TreeNode right) {
            this.right = right;
        }
    }

    public TreeNode invertTree(TreeNode root) {
        if (root == null) {
            return null;
        }
        TreeNode newTreeNode = new TreeNode(root.val);
        newTreeNode.left = invertTree(root.right);
        newTreeNode.right = invertTree(root.left);
        return newTreeNode;
    }
}
