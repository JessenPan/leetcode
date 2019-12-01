package org.jessenpan.leetcode.dfs;

import java.util.*;

/**
 * @author jessenpan
 */
public class S1110DeleteNodesAndReturnForest {

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

    private List<TreeNode> trees = new ArrayList<>();

    private Set<Integer> deletes = new HashSet<>();

    public List<TreeNode> delNodes(TreeNode root, int[] to_delete) {
        if (to_delete == null || to_delete.length == 0) {
            return Collections.singletonList(root);
        }
        Arrays.stream(to_delete).forEach(t -> deletes.add(t));
        split(null, root, "l");
        return trees;
    }

    private void split(TreeNode parent, TreeNode node, String direction) {
        if (node == null) {
            return;
        }

        if (deletes.contains(node.val)) {

            split(null, node.left, "l");
            split(null, node.right, "r");

            if (parent != null) {
                if (direction.equals("l")) {
                    parent.left = null;
                } else {
                    parent.right = null;
                }
            }

            return;
        }

        split(node, node.left, "l");
        split(node, node.right, "r");
        if (parent == null) {
            trees.add(node);
        }
    }

}
