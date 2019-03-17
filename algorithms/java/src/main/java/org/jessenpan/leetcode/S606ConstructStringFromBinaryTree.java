package org.jessenpan.leetcode;

/**
 * @author jessenpan
 * tag:tree
 */
public class S606ConstructStringFromBinaryTree {

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

    public String tree2str(TreeNode t) {
        convert(t);
        return sb.toString();
    }

    private void convert(TreeNode node) {
        if (node == null) {
            return;
        }
        sb.append(node.val);
        if (node.left == null && node.right == null) {
            return;
        }
        if (node.left == null) {
            sb.append(EMPTY_BRACKET);
        } else {
            sb.append(LEFT_BRACKET);
            convert(node.left);
            sb.append(RIGHT_BRACKET);
        }
        if (node.right != null) {
            sb.append(LEFT_BRACKET);
            convert(node.right);
            sb.append(RIGHT_BRACKET);
        }
    }

    private static final String LEFT_BRACKET = "(";

    private static final String RIGHT_BRACKET = ")";

    private static final String EMPTY_BRACKET = "()";

    private StringBuilder sb = new StringBuilder();
}
