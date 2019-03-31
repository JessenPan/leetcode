package org.jessenpan.leetcode.tree;

/**
 * @author jessenpan
 * tag:tree
 */
public class S572SubtreeOfAnotherTree {

    public static class TreeNode {

        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) { val = x; }
    }

    private TreeNode targetSubTree;

    public boolean isSubtree(TreeNode s, TreeNode t) {
        this.targetSubTree = t;
        return isSubtree(s);
    }

    private boolean isSubtree(TreeNode node) {
        if (node == null) {
            return false;
        }
        if (node.val == targetSubTree.val) {
            if (isEqualOfTree(node, targetSubTree)) {
                return true;
            }
        }
        if (isSubtree(node.left)) {
            return true;
        }
        return isSubtree(node.right);
    }

    private boolean isEqualOfTree(TreeNode node1, TreeNode node2) {
        if (node1 == null && node2 == null) {
            return true;
        }
        if (node1 == null || node2 == null) {
            return false;
        }
        if (node1.val != node2.val) {
            return false;
        }
        if (!isEqualOfTree(node1.left, node2.left)) {
            return false;
        }

        return isEqualOfTree(node1.right, node2.right);
    }

}
