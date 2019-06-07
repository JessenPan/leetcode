package org.jessenpan.leetcode.tree;

/**
 * @author jessenpan
 * tag:tree
 */
public class S1008ConstructBinarySearchTreeFromPreorderTraversal {

    public static class TreeNode {

        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) { val = x; }
    }

    public TreeNode bstFromPreorder(int[] preorder) {
        return buildBSTTree(0, preorder.length - 1, preorder);
    }

    private TreeNode buildBSTTree(int left, int right, int[] preorder) {
        if (left > right) {
            return null;
        }

        TreeNode node = new TreeNode(preorder[left]);

        int nodeVal = preorder[left];
        int rightTreeStartIndex = -1;
        int leftTreeEndIndex = -1;
        for (int i = left + 1; i <= right; i++) {
            if (preorder[i] > nodeVal) {
                rightTreeStartIndex = i;
                break;
            } else {
                leftTreeEndIndex = i;
            }
        }
        if (leftTreeEndIndex != -1) {
            node.left = buildBSTTree(left + 1, leftTreeEndIndex, preorder);
        }
        if (rightTreeStartIndex != -1) {
            node.right = buildBSTTree(rightTreeStartIndex, right, preorder);
        }
        return node;
    }
}
