package org.jessenpan.leetcode.tree;

/**
 * @author jessenpan
 * tag:tree
 */
public class S654MaximumBinaryTree {

    public static class TreeNode {

        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) { val = x; }
    }

    public TreeNode constructMaximumBinaryTree(int[] nums) {
        int l = 0, r = nums.length - 1;

        return constructTree(l, r, nums);
    }

    private TreeNode constructTree(int l, int r, int[] nums) {
        if (l > r) {
            return null;
        }
        int max = nums[l], index = l;
        for (int i = l; i <= r; i++) {
            if (nums[i] > max) {
                index = i;
                max = nums[i];
            }
        }
        TreeNode node = new TreeNode(max);
        node.left = constructTree(l, index - 1, nums);
        node.right = constructTree(index + 1, r, nums);
        return node;
    }

}
