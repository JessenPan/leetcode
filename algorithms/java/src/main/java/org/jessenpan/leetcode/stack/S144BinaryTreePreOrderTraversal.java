package org.jessenpan.leetcode.stack;

import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

/**
 * @author jessenpan
 * tag:stack
 */
public class S144BinaryTreePreOrderTraversal {

    public static class TreeNode {

        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) { val = x; }
    }

    public List<Integer> preorderTraversal(TreeNode root) {

        List<Integer> preOrderList = new LinkedList<>();
        Stack<TreeNode> stagedStack = new Stack<>();
        TreeNode currentNode = root;
        while (!stagedStack.isEmpty() || currentNode != null) {
            if (currentNode != null) {
                preOrderList.add(currentNode.val);
                stagedStack.add(currentNode);
                currentNode = currentNode.left;
            } else {
                currentNode = stagedStack.pop().right;
            }
        }

        return preOrderList;
    }

}
