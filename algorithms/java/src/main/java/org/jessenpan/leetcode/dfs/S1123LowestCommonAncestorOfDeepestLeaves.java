package org.jessenpan.leetcode.dfs;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

/**
 * @author jessenpan
 * tag:dfs
 */
public class S1123LowestCommonAncestorOfDeepestLeaves {

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

    private TreeNode lca;

    private int maxLeafDepth = Integer.MIN_VALUE;

    private Set<TreeNode> leaves = new HashSet<>();

    public TreeNode lcaDeepestLeaves(TreeNode root) {
        findLeafs(root, 1);
        if (leaves.size() == 1) {
            return new ArrayList<>(leaves).get(0);
        }
        findLCA(root);
        return lca;
    }

    private boolean findLCA(TreeNode node) {
        if (node.left == null && node.right == null) {
            return leaves.contains(node);
        }
        boolean leftFound = true, rightFound = true;
        if (node.left != null && node.right != null) {
            leftFound = findLCA(node.left);
            rightFound = findLCA(node.right);

            if (leftFound && rightFound) {
                lca = node;
                return true;
            }
            return leftFound || rightFound;
        }

        if (node.left != null) {
            leftFound = findLCA(node.left);
            return leftFound;
        }

        rightFound = findLCA(node.right);
        return rightFound;
    }

    private void findLeafs(TreeNode node, int depth) {
        if (node.left == null && node.right == null) {
            if (depth > maxLeafDepth) {
                maxLeafDepth = depth;
                leaves.clear();
                leaves.add(node);
            } else if (depth == maxLeafDepth) {
                leaves.add(node);
            }
            return;
        }

        if (node.left != null) {
            findLeafs(node.left, depth + 1);
        }
        if (node.right != null) {
            findLeafs(node.right, depth + 1);
        }
    }

}
