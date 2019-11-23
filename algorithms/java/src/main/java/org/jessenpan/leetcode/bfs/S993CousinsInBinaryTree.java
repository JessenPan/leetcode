package org.jessenpan.leetcode.bfs;

/**
 * @author jessenpan
 * tag:tree
 */
public class S993CousinsInBinaryTree {

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

    private static class RichNode {

        TreeNode parent;
        int val;
        int height = 0;

        RichNode(int x) {
            this.val = x;
        }

    }

    public boolean isCousins(TreeNode root, int x, int y) {
        RichNode richNodeX = new RichNode(x);
        RichNode richNodeY = new RichNode(y);
        findTarget(root, richNodeX, null, 0);
        findTarget(root, richNodeY, null, 0);
        return richNodeX.height == richNodeY.height && richNodeX.parent != null && richNodeX.parent != richNodeY.parent;
    }

    private void findTarget(TreeNode node, RichNode target, TreeNode parent, int height) {
        if (node == null) {
            return;
        }

        if (node.val == target.val) {
            target.height = height;
            target.parent = parent;
            return;
        }
        height++;
        findTarget(node.left, target, node, height);
        findTarget(node.right, target, node, height);
    }
}
