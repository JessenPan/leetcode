package org.jessenpan.leetcode.tree;

import java.util.HashSet;
import java.util.Set;

/**
 * @author jessenpan
 * tag:tree
 */
public class S865SmallestSubtreeWithAllTheDeepestNodes {

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

    int maxDeep = -1;

    Set<TreeNode> nodes = new HashSet<>();

    TreeNode target = null;

    public void setTarget(TreeNode target) {
        if (this.target == null) {
            this.target = target;
        }
    }

    public TreeNode subtreeWithAllDeepest(TreeNode root) {
        calcDeep(root, 0);
        if (maxDeep == 0) {
            return root;
        }
        find(root);
        return target;
    }

    private int find(TreeNode node) {

        if (node == null) {
            return 0;
        }

        if (target != null) {
            return 0;
        }
        int sum = 0;

        sum += find(node.left);
        sum += find(node.right);
        if (nodes.contains(node)) {
            sum++;
        }
        if (sum == nodes.size()) {
            setTarget(node);
        }
        return sum;
    }

    private void calcDeep(TreeNode node, int currentDeep) {

        if (node.left == null && node.right == null) {

            if (currentDeep == maxDeep) {
                nodes.add(node);
            } else if (currentDeep > maxDeep) {
                maxDeep = currentDeep;
                nodes.clear();
                nodes.add(node);
            }
            return;
        }

        if (node.left != null) {
            calcDeep(node.left, currentDeep + 1);
        }
        if (node.right != null) {
            calcDeep(node.right, currentDeep + 1);
        }
    }

}
