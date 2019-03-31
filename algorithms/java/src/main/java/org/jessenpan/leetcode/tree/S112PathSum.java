package org.jessenpan.leetcode.tree;

/**
 * @author jessenpan
 * tag:tree
 */
public class S112PathSum {

    public static class TreeNode {

        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) { val = x; }
    }

    public boolean hasPathSum(TreeNode root, int sum) {
        if (root == null) {
            return false;
        }
        this.targetSum = sum;
        return countToSum(root, 0);
    }

    private int targetSum;

    public boolean countToSum(TreeNode node, int currentSum) {
        if (node == null) {
            return false;
        }
        currentSum=node.val+currentSum;
        if (node.left == null && node.right == null) {
            //leaf
            if (currentSum == targetSum) {
                return true;
            }
        }
        if(countToSum(node.left,currentSum)){
            return true;
        }
        return countToSum(node.right, currentSum);
    }

}
