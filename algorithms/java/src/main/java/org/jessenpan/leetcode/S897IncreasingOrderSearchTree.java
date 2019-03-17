package org.jessenpan.leetcode;

import java.util.Stack;

/**
 * @author jessenpan
 * tag:tree
 */
public class S897IncreasingOrderSearchTree {

    public class TreeNode {

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

    public TreeNode increasingBST(TreeNode root) {

        TreeNode newTreeRoot = null, newTreeCurrent = null;
        TreeNode oldTreeCurrent = root;
        Stack<TreeNode> traversalStack = new Stack<>();
        while (oldTreeCurrent != null || !traversalStack.isEmpty()) {
            if (oldTreeCurrent != null) {
                traversalStack.push(oldTreeCurrent);
                oldTreeCurrent = oldTreeCurrent.left;
            } else {
                TreeNode nodeAtStack = traversalStack.pop();
                if (newTreeCurrent == null) {
                    newTreeRoot = newTreeCurrent = new TreeNode(nodeAtStack.val);
                } else {
                    TreeNode nextLeftNode = new TreeNode(nodeAtStack.val);
                    newTreeCurrent.right = nextLeftNode;
                    newTreeCurrent = nextLeftNode;
                }
                oldTreeCurrent = nodeAtStack.right;
            }
        }
        return newTreeRoot;
    }
}
