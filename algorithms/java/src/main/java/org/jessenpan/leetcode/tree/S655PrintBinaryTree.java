package org.jessenpan.leetcode.tree;

import java.util.ArrayList;
import java.util.List;

/**
 * @author jessenpan
 * tag:tree
 */
public class S655PrintBinaryTree {

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

    public List<List<String>> printTree(TreeNode root) {
        int height = countHeight(root);
        int width = (int) (Math.pow(2, height) - 1);
        List<List<String>> ans = new ArrayList<>();
        for (int i = 0; i < height; i++) {
            ans.add(new ArrayList<>());
            for (int j = 0; j < width; j++) {
                ans.get(i).add("");
            }
        }

        fillList(ans, 0, width - 1, 0, root);
        return ans;
    }

    private void fillList(List<List<String>> ans, int left, int right, int curLevel, TreeNode node) {
        if (left > right || node == null) {
            return;
        }

        int mid = (left + right) / 2;
        ans.get(curLevel).set(mid, String.valueOf(node.val));

        fillList(ans, left, mid - 1, curLevel + 1, node.left);
        fillList(ans, mid + 1, right, curLevel + 1, node.right);
    }

    public int countHeight(TreeNode root) {
        if (root == null) {
            return 0;
        }
        return 1 + Math.max(countHeight(root.left), countHeight(root.right));
    }

}
