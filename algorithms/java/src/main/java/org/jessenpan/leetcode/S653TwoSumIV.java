package org.jessenpan.leetcode;

import java.util.HashSet;
import java.util.Set;

/**
 * @author jessenpan
 * tag:tree
 */
public class S653TwoSumIV {

    public static class TreeNode {

        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) { val = x; }
    }

    private Set<Integer> nodeSet = new HashSet<>();

    public boolean findTarget(TreeNode root, int k) {
        if (root == null) {
            return false;
        }
        return isExistSum(root, k);
    }

    public boolean isExistSum(TreeNode node, int target) {
        if (node == null) {
            return false;
        }
        int theAnother = target - node.val;
        if (nodeSet.contains(theAnother)) {
            return true;
        }
        nodeSet.add(node.val);
        if (isExistSum(node.left, target)) {
            return true;
        }
        return isExistSum(node.right, target);

    }

}
