package org.jessenpan.leetcode;

import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

/**
 * @author jessenpan
 * tag:stack
 */
public class S94BinaryTreeInOrderTraversal {

    public static class TreeNode {

        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) { val = x; }
    }

    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> result = new LinkedList<>();
        //        recursionTraversal(result, root);
        //        return result;
        //the above it is recursive implementation

        seqTraversal(result, root);
        return result;
    }

    public void seqTraversal(List<Integer> list, TreeNode node) {
        Stack<TreeNode> stack = new Stack<>();
        TreeNode cur = node;
        while (cur != null || !stack.isEmpty()) {
            if (cur != null) {
                stack.push(cur);
                cur = cur.left;
            } else {
                cur = stack.pop();
                list.add(cur.val);
                cur = cur.right;
            }
        }
    }

    private void recursionTraversal(List<Integer> list, TreeNode root) {
        if (root == null) {
            return;
        }
        recursionTraversal(list, root.left);
        list.add(root.val);
        recursionTraversal(list, root.right);
    }
}
