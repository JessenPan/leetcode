package org.jessenpan.leetcode;

/**
 * @author jessenpan
 * tag:tree
 */
public class S104MaximumDepthOfBinaryTree {

    public class TreeNode {

        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) { val = x; }

        public TreeNode getLeft() {
            return left;
        }

        public void setLeft(TreeNode left) {
            this.left = left;
        }

        public TreeNode getRight() {
            return right;
        }

        public void setRight(TreeNode right) {
            this.right = right;
        }
    }

    public int maxDepth(TreeNode root) {
        traverseTree(root, 0);
        return theMaxDepth;
    }

    public void traverseTree(TreeNode node, int currentLength) {
        if (node == null) {
            if (currentLength > theMaxDepth) {
                theMaxDepth = currentLength;
            }
            return;
        }
        currentLength++;
        traverseTree(node.left, currentLength);
        traverseTree(node.right, currentLength);
    }

    private int theMaxDepth = 0;
}
