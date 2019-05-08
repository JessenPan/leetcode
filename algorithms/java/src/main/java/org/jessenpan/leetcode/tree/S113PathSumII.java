package org.jessenpan.leetcode.tree;

import java.util.ArrayList;
import java.util.List;

/**
 * @author jessenpan
 * tag:tree
 */
public class S113PathSumII {

    public static class TreeNode {

        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) { val = x; }
    }

    private List<List<Integer>> pathSums = new ArrayList<>();

    private int sum;

    public List<List<Integer>> pathSum(TreeNode root, int sum) {
        this.sum = sum;
        findPathSum(root, new ArrayList<>(), 0);
        return pathSums;
    }

    private void findPathSum(TreeNode node, List<Integer> subNodes, int currentSum) {
        if (node == null) {
            return;
        }
        currentSum += node.val;
        if (currentSum == sum && node.left == null && node.right == null) {
            subNodes.add(node.val);
            pathSums.add(subNodes);
            return;
        } else if (currentSum == sum) {
            return;
        }

        if (node.left != null) {
            List<Integer> newSubNodes = new ArrayList<>(subNodes);
            newSubNodes.add(node.val);
            findPathSum(node.left, newSubNodes, currentSum);
        }
        if (node.right != null) {
            List<Integer> newSubNodes = new ArrayList<>(subNodes);
            newSubNodes.add(node.val);
            findPathSum(node.right, newSubNodes, currentSum);
        }
    }
}
