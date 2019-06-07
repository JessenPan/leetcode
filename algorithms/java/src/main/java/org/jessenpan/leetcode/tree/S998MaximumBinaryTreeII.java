package org.jessenpan.leetcode.tree;

/**
 * @author jessenpan
 */
public class S998MaximumBinaryTreeII {

    public static class TreeNode {

        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) { val = x; }
    }

    public TreeNode insertIntoMaxTree(TreeNode root, int val) {
        TreeNode node = new TreeNode(val);
        if (root == null) {
            return node;
        }
        if (root.val < val) {
            node.left = root;
            root = node;//防止断链
        } else {
            root.right = insertIntoMaxTree(root.right, val);//重新构建右子树
        }
        return root;

    }
}
