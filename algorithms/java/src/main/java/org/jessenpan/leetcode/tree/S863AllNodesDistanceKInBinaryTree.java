package org.jessenpan.leetcode.tree;

import java.util.*;

/**
 * @author jessenpan
 * tag:tree
 */
public class S863AllNodesDistanceKInBinaryTree {

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

    private Set<Integer> ans = new HashSet<>();

    private TreeNode target;

    private int distanceBtRootTarget = 0;

    private boolean found = false;

    private boolean side;

    public List<Integer> distanceK(TreeNode root, TreeNode target, int k) {
        if (k == 0) {
            return Collections.singletonList(target.val);
        }
        findDistance(root, target, 0, true);

        if (distanceBtRootTarget == k) {
            ans.add(root.val);
            findK(this.target, k, 0);
            return new ArrayList<>(ans);
        }

        findK(this.target, k, 0);
        if (distanceBtRootTarget < k) {
            findK(side ? root.right : root.left, k - distanceBtRootTarget - 1, 0);
        } else {
            findK(side ? root.left : root.right, distanceBtRootTarget - k - 1, 0);
        }
        return new ArrayList<>(ans);
    }

    private void findK(TreeNode target, int k, int curHeight) {
        if (target == null) {
            return;
        }
        if (k == curHeight) {
            ans.add(target.val);
            return;
        }
        findK(target.left, k, curHeight + 1);
        findK(target.right, k, curHeight + 1);
    }

    public TreeNode findDistance(TreeNode node, TreeNode target, int curDistance, boolean side) {
        if (node == null || found) {
            return node;
        }
        if (node.val == target.val) {
            this.target = node;
            this.distanceBtRootTarget = curDistance;
            found = true;
            this.side = side;
            return null;
        }
        node.left = findDistance(node.left, target, curDistance + 1, curDistance == 0 ? true : side);
        node.right = findDistance(node.right, target, curDistance + 1, curDistance == 0 ? false : side);
        return node;
    }

}
