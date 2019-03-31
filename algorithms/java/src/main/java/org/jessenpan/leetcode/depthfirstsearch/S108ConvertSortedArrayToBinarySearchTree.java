package org.jessenpan.leetcode.depthfirstsearch;

/**
 * @author jessenpan
 * tag:deep-first search
 */
public class S108ConvertSortedArrayToBinarySearchTree {

    public static class TreeNode {

        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) { val = x; }
    }

    public TreeNode sortedArrayToBST(int[] nums) {
        if (nums.length == 0) {
            return null;
        }
        int length = nums.length;
        if (length == 1) {
            return new TreeNode(nums[0]);
        }
        int parentNodePosition = length / 2;
        TreeNode node = new TreeNode(nums[parentNodePosition]);
        int[] leftArray = new int[parentNodePosition];
        System.arraycopy(nums, 0, leftArray, 0, parentNodePosition);
        node.left = sortedArrayToBST(leftArray);
        if (length - parentNodePosition - 1 > 0) {
            int[] rightArray = new int[length - parentNodePosition - 1];
            System.arraycopy(nums, parentNodePosition + 1, rightArray, 0, length - parentNodePosition - 1);
            node.right = sortedArrayToBST(rightArray);
        }
        return node;
    }
}
