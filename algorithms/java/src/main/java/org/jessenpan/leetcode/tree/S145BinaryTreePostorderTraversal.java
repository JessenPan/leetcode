package org.jessenpan.leetcode.tree;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * @author jessenpan
 * tag:tree
 * //TODO:optimize it
 */
public class S145BinaryTreePostorderTraversal {

    public static class TreeNode {

        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) { val = x; }

        TreeNode(int x, TreeNode left, TreeNode right) {
            this.val = x;
            this.left = left;
            this.right = right;
        }
    }

    public List<Integer> postorderTraversal(TreeNode root) {
        Stack<TreeNode> stack = new Stack<>();
        List<Integer> postorders = new ArrayList<>();
        TreeNode current = root;
        while (!stack.isEmpty() || current != null) {

            if (current != null) {
                stack.push(new TreeNode(current.val));
                if (current.right != null) {
                    stack.push(current.right);
                }
                current = current.left;
            } else {
                current = stack.pop();
                if (current.right == null && current.left == null) {
                    postorders.add(current.val);
                    if (!stack.isEmpty()) {
                        current = stack.pop();
                    } else {
                        current = null;
                    }
                }
            }
        }
        return postorders;
    }

}
