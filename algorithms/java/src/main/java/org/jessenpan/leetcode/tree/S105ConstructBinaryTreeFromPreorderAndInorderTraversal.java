package org.jessenpan.leetcode.tree;

/**
 * @author jessenpan
 * tag:tree
 */
public class S105ConstructBinaryTreeFromPreorderAndInorderTraversal {

    public static class TreeNode {

        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) { val = x; }
    }

    public TreeNode buildTree(int[] preOrder, int[] inOrder) {
        if (preOrder.length == 0) {
            return null;
        }
        return buildTree(inOrder, 0, inOrder.length - 1, preOrder, 0, preOrder.length - 1);
    }

    private TreeNode buildTree(int[] inorder, int inL, int inR, int[] preOrder, int preL, int preR) {
        if (preL == preR) {
            return new TreeNode(preOrder[preL]);
        }
        if (preL > preR) {
            return null;
        }

        TreeNode node = new TreeNode(preOrder[preL]);

        for (int i = inL; i <= inR; i++) {
            if (inorder[i] == preOrder[preL]) {
                node.left = buildTree(inorder, inL, i - 1, preOrder, preL + 1, preL + i - inL);
                node.right = buildTree(inorder, i + 1, inR, preOrder, preL + i - inL + 1, preR);
            }
        }

        return node;
    }
}
