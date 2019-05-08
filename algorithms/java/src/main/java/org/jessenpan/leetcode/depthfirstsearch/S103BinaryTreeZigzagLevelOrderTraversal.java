package org.jessenpan.leetcode.depthfirstsearch;

import java.util.*;

/**
 * @author jessenpan
 * tag:depthFirstSearch
 */
public class S103BinaryTreeZigzagLevelOrderTraversal {

    public static class TreeNode {

        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) { val = x; }
    }

    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        if (root == null) {
            return Collections.emptyList();
        }
        int level = 2;
        List<List<Integer>> zigzagOrders = new ArrayList<>();
        Stack<TreeNode> stack = new Stack<>();
        stack.push(root);
        while (!stack.isEmpty()) {
            List<Integer> list = new ArrayList<>();
            Stack<TreeNode> nextLevel = new Stack<>();
            while (!stack.isEmpty()) {
                TreeNode node = stack.pop();
                list.add(node.val);

                if ((level & 1) == 1) {
                    if (node.right != null) {
                        nextLevel.push(node.right);
                    }
                    if (node.left != null) {
                        nextLevel.push(node.left);
                    }
                } else {
                    if (node.left != null) {
                        nextLevel.push(node.left);
                    }
                    if (node.right != null) {
                        nextLevel.push(node.right);
                    }
                }
            }
            level++;
            zigzagOrders.add(list);
            stack = nextLevel;
        }
        return zigzagOrders;
    }

}
