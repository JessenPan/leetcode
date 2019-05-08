package org.jessenpan.leetcode.tree;

/**
 * @author jessenpan
 * tag:tree
 */
public class S106ConstructBinaryTreeFromInorderAndPostorderTraversal {

    public static class TreeNode {

        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) { val = x; }
    }

    public TreeNode buildTree(int[] inorder, int[] postorder) {
        if (inorder.length == 0) {
            return null;
        }
        return buildTree(inorder, 0, inorder.length - 1, postorder, 0, postorder.length - 1);
    }

    private TreeNode buildTree(int[] inorder, int inL, int inR, int[] postorder, int postL, int postR) {
        if (postL == postR) {
            return new TreeNode(postorder[postL]);
        }
        if (postL > postR) {
            return null;
        }

        TreeNode node = new TreeNode(postorder[postR]);

        for (int i = inL; i <= inR; i++) {
            if (inorder[i] == postorder[postR]) {
                node.left = buildTree(inorder, inL, i - 1, postorder, postL, postL + i - inL - 1);
                node.right = buildTree(inorder, i + 1, inR, postorder, postL + i - inL, postR - 1);
            }
        }

        return node;
    }

}
