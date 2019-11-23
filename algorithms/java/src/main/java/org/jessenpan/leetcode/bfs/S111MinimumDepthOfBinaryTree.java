package org.jessenpan.leetcode.bfs;

/**
 * @author jessenpan
 * tag:tree
 */
public class S111MinimumDepthOfBinaryTree {

    public static class TreeNode {

        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) { val = x; }
    }

    private static final int DEFAULT_DEPTH = 1;

    private int minDepth = DEFAULT_DEPTH;

    public int minDepth(TreeNode root) {
        if(root==null){
            return 0;
        }
        findMinDepth(root, DEFAULT_DEPTH);
        return minDepth;
    }

    private void findMinDepth(TreeNode node, int currentDepth) {
        if (node == null) {
            return;
        }
        if (node.left == null && node.right == null) {
            if (currentDepth != 0 && minDepth == DEFAULT_DEPTH) {
                minDepth = currentDepth;
            } else if (currentDepth < minDepth) {
                minDepth = currentDepth;
            }
        }
        currentDepth++;
        findMinDepth(node.left, currentDepth);
        findMinDepth(node.right, currentDepth);
    }
}
