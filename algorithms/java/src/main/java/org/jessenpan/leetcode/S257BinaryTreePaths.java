package org.jessenpan.leetcode;

import java.util.LinkedList;
import java.util.List;

/**
 * @author jessenpan
 * tag:tree
 */
public class S257BinaryTreePaths {

    public static class TreeNode {

        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x, TreeNode left, TreeNode right) {
            this.val = x;
            this.left = left;
            this.right = right;
        }

        TreeNode(int x) { val = x; }
    }

    public List<String> binaryTreePaths(TreeNode root) {
        traverseTree(root, "");
        return theTreePaths;
    }

    private void traverseTree(TreeNode currentNode, String path) {
        if (currentNode == null) {
            return;
        }

        String newPath = path + currentNode.val;
        if (currentNode.left == null && currentNode.right == null) {
            theTreePaths.add(newPath);
        }
        newPath += "->";
        traverseTree(currentNode.left, newPath);
        traverseTree(currentNode.right, newPath);
    }

    private List<String> theTreePaths = new LinkedList<>();
}
