package org.jessenpan.leetcode;

import java.util.LinkedList;
import java.util.List;

/**
 * @author jessenpan
 * tag:Tree
 */
public class S872LeafSimilarTrees {

    public static class TreeNode {

        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) { val = x; }
    }

    public boolean leafSimilar(TreeNode root1, TreeNode root2) {

        List<Integer> leafOfTree1 = new LinkedList<>();
        pickLeaf(root1, leafOfTree1);
        List<Integer> leafOfTree2 = new LinkedList<>();
        pickLeaf(root2, leafOfTree2);
        return leafOfTree1.equals(leafOfTree2);
    }

    private void pickLeaf(TreeNode node, List<Integer> leafOfTree) {
        if (node == null) {
            return;
        }
        if (node.left == null && node.right == null) {
            leafOfTree.add(node.val);
            return;
        }
        pickLeaf(node.left, leafOfTree);
        pickLeaf(node.right, leafOfTree);
    }
}
