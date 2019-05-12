package org.jessenpan.leetcode.tree;

/**
 * @author jessenpan
 * tag:tree
 */
public class S988SmallestStringStartingFromLeaf {

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

    private String smallest = "";

    public String smallestFromLeaf(TreeNode root) {
        if (root == null) {
            return "";
        }
        findSmallestLeaf(root, "");
        return smallest;
    }

    private void findSmallestLeaf(TreeNode node, String currentStr) {
        if (node == null) {
            return;
        }
        char currentChar = (char) (node.val + 'a');
        currentStr = currentStr + currentChar;
        if (node.left == null && node.right == null) {
            currentStr = new StringBuilder(currentStr).reverse().toString();
            if ("".equals(smallest)) {
                smallest = currentStr;
            } else if (smallest.compareTo(currentStr) > 0) {
                smallest = currentStr;
            }
            return;
        }

        findSmallestLeaf(node.left, currentStr);
        findSmallestLeaf(node.right, currentStr);
    }

}
