package org.jessenpan.leetcode.tree;

/**
 * @author jessenpan
 * tag:tree
 */
public class S623AddOneRowToTree {

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

    public TreeNode addOneRow(TreeNode root, int v, int d) {
        if (d == 1) {
            TreeNode newRoot = new TreeNode(v);
            newRoot.left = root;
            return newRoot;
        }

        addValToRow(root, v, d - 1, 1);
        return root;
    }

    private void addValToRow(TreeNode node, int v, int height, int currentHeight) {
        if (node == null) {
            return;
        }
        if (height == currentHeight) {
            TreeNode originLeft = node.left;
            TreeNode originRight = node.right;
            node.left = new TreeNode(v);
            node.left.left = originLeft;
            node.right = new TreeNode(v);
            node.right.right = originRight;
            return;
        }
        addValToRow(node.left, v, height, currentHeight + 1);
        addValToRow(node.right, v, height, currentHeight + 1);
    }

}
