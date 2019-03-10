package org.jessenpan.leetcode;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

/**
 * @author jessenpan
 * tag:stack
 */
public class S173BinarySearchTreeIterator {

    public static class TreeNode {

        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) { val = x; }
    }

    public static class BSTIterator {

        private TreeNode treeNode;

        private Queue<Integer> inOrderList = new LinkedList<>();

        public BSTIterator(TreeNode root) {
            Stack<TreeNode> treeNodeStack = new Stack<>();
            TreeNode currentNode = root;
            while (!treeNodeStack.isEmpty() || currentNode != null) {
                if (currentNode != null) {
                    treeNodeStack.push(currentNode);
                    currentNode = currentNode.left;
                } else {
                    inOrderList.offer(treeNodeStack.peek().val);
                    currentNode = treeNodeStack.pop().right;
                }
            }
        }

        /**
         * @return the next smallest number
         */
        public int next() {
            return inOrderList.poll();
        }

        /**
         * @return whether we have a next smallest number
         */
        public boolean hasNext() {
            return !inOrderList.isEmpty();
        }
    }

}
