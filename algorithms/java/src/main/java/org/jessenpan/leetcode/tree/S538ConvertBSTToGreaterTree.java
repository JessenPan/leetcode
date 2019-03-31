package org.jessenpan.leetcode.tree;

/**
 * @author jessenpan
 * tag:tree
 */
public class S538ConvertBSTToGreaterTree {

    public class TreeNode {

        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) { val = x; }
    }

    public TreeNode convertBST(TreeNode root) {
        return traverseTree(root);
    }

    private int sumOfGreaterNode = 0;

    private TreeNode traverseTree(TreeNode node) {
        if (node == null) {
            return null;
        }
        TreeNode newRightNode = traverseTree(node.right);
        sumOfGreaterNode += node.val;
        TreeNode newNode = new TreeNode(sumOfGreaterNode);
        newNode.right = newRightNode;
        newNode.left = traverseTree(node.left);
        return newNode;
    }

}
