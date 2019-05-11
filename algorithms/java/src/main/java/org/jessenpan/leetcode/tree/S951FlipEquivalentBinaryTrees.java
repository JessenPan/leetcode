package org.jessenpan.leetcode.tree;

import java.util.HashSet;
import java.util.Set;

/**
 * @author jessenpan
 * tag:tree
 */
public class S951FlipEquivalentBinaryTrees {

    public static class TreeNode {

        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) { val = x; }
    }

    public boolean flipEquiv(TreeNode root1, TreeNode root2) {
        if (root1 == root2 && root1 == null) {
            return true;
        } else if (root1 == null || root2 == null || root1.val != root2.val) {
            return false;
        }

        Set<Integer> root1Left = new HashSet<>();
        Set<Integer> root1Right = new HashSet<>();
        findNodes(root1.left, root1Left);
        findNodes(root1.right, root1Right);

        Set<Integer> root2Left = new HashSet<>();
        Set<Integer> root2Right = new HashSet<>();
        findNodes(root2.left, root2Left);
        findNodes(root2.right, root2Right);
        if (root1.val == root2.val && (root1Left.equals(root2Left) && root1Right.equals(root2Right))) {
            return flipEquiv(root1.left, root2.left) && flipEquiv(root1.right, root2.right);
        } else if (root1.val == root2.val && (root1Left.equals(root2Right) && root1Right.equals(root2Left))) {
            return flipEquiv(root1.left, root2.right) && flipEquiv(root1.right, root2.left);
        } else {
            return false;
        }
    }

    public void findNodes(TreeNode node, Set<Integer> set) {
        if (node == null) {
            return;
        }
        set.add(node.val);
        findNodes(node.left, set);
        findNodes(node.right, set);
    }

}
