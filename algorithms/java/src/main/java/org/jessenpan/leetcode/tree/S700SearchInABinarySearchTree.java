package org.jessenpan.leetcode.tree;

/**
 * @author jessenpan
 * tag:tree
 */
public class S700SearchInABinarySearchTree {

    public class TreeNode {

        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) { val = x; }
    }

    public TreeNode searchBST(TreeNode root, int theTargetValue) {
        searchTheTargetTree(root, theTargetValue);
        return theSearchedBST;
    }

    private boolean searchTheTargetTree(TreeNode node, int theTargetValue) {
        if (node == null) {
            return false;
        }
        if (node.val == theTargetValue) {
            theSearchedBST = node;
            return true;
        }
        boolean isFoundAtLeft = searchTheTargetTree(node.left, theTargetValue);
        if (isFoundAtLeft) {
            return true;
        }
        return searchTheTargetTree(node.right, theTargetValue);
    }

    private TreeNode theSearchedBST;
}
