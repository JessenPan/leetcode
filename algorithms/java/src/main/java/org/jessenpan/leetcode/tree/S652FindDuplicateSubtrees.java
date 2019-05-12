package org.jessenpan.leetcode.tree;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author jessenpan
 * tag:tree
 */
public class S652FindDuplicateSubtrees {

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

    private Map<String, Integer> record = new HashMap<>();

    private List<TreeNode> duplicatedSubtrees = new ArrayList<>();

    public List<TreeNode> findDuplicateSubtrees(TreeNode root) {

        findDuplicateSubtree(root);
        return duplicatedSubtrees;
    }

    private void findDuplicateSubtree(TreeNode node) {

        if (node == null) {
            return;
        }

        recordSubStr(node.left);
        recordSubStr(node.right);
        findDuplicateSubtree(node.left);
        findDuplicateSubtree(node.right);
    }

    private void recordSubStr(TreeNode node) {
        if (node == null) {
            return;
        }
        StringBuilder sb = new StringBuilder();
        calTreeStr(node, sb);
        String str = sb.toString();
        if (!str.isEmpty()) {
            Integer times = record.get(str);
            if (times != null && times == 1) {
                duplicatedSubtrees.add(node);
            }
            times = (times == null) ? 1 : times + 1;
            record.put(str, times);
        }
    }

    private void calTreeStr(TreeNode node, StringBuilder sb) {
        if (node == null) {
            sb.append("_");
            return;
        }
        sb.append(node.val);
        calTreeStr(node.left, sb);
        calTreeStr(node.right, sb);
    }

}
