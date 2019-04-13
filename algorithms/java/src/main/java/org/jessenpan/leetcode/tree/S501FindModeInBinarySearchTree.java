package org.jessenpan.leetcode.tree;

import java.util.ArrayList;
import java.util.List;

/**
 * @author jessenpan
 * tag:tree
 * 二叉搜索树的中序遍历是一个递增数组
 */
public class S501FindModeInBinarySearchTree {

    public static class TreeNode {

        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            this.val = x;
        }
    }

    public int[] findMode(TreeNode root) {
        countMode(root);
        return nums.stream().mapToInt(t -> t).toArray();
    }

    private int max = 0;
    private List<Integer> nums = new ArrayList<>();

    private int pre = 0;
    private int count = 0;

    private void countMode(TreeNode node) {
        if (node == null) {
            return;
        }
        countMode(node.left);
        if (count == 0) {
            count++;
            pre = node.val;
        } else {
            if (pre == node.val) {
                count++;
            } else {
                pre = node.val;
                count = 1;
            }
        }
        if (count > max) {
            nums.clear();
            nums.add(pre);
            max = count;
        } else if (max == count) {
            nums.add(pre);
        }
        countMode(node.right);
    }
}
