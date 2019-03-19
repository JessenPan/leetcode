package org.jessenpan.leetcode;

/**
 * @author jessenpan
 * tag:tree
 */
public class S110BalancedBinaryTree {

    public static class TreeNode {

        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) { val = x; }
    }

    public boolean isBalanced(TreeNode root) {
        if (root == null) {
            return true;
        }
        return false;
    }

    

   
}
