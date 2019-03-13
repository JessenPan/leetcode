package org.jessenpan.leetcode;

/**
 * @author jessenpan
 */
public class S617MergeTwoBinaryTrees {

    public static class TreeNode {

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

    public TreeNode mergeTrees(TreeNode t1, TreeNode t2) {
        if (t1 == null && t2 == null) {
            return null;
        }
        TreeNode newTreeNode = new TreeNode((t1 == null ? 0 : t1.val) + (t2 == null ? 0 : t2.val));
        newTreeNode.left = mergeTrees(t1 == null ? null : t1.left, t2 == null ? null : t2.left);
        newTreeNode.right = mergeTrees(t1 == null ? null : t1.right, t2 == null ? null : t2.right);
        return newTreeNode;
    }

}
