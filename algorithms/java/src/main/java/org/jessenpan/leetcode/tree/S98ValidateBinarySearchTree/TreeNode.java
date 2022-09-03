package org.jessenpan.leetcode.tree.S98ValidateBinarySearchTree;

/**
 * @author jessenpan
 */
public class TreeNode {

    int val;
    TreeNode left;
    TreeNode right;

   public TreeNode(int x) { val = x; }

   public TreeNode(int x, TreeNode left, TreeNode right) {
        this.val = x;
        this.left = left;
        this.right = right;
    }

}
