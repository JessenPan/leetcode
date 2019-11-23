package org.jessenpan.leetcode.bfs;

import java.util.*;

/**
 * @author jessenpan
 * tag:breadthfirstsearch
 */
public class S1161MaximumLevelSumOfABinaryTree {

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

    private Map<Integer, List<Integer>> record = new HashMap<>();

    public int maxLevelSum(TreeNode root) {

        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        int level = 1, sum;
        while (!queue.isEmpty()) {
            sum = 0;
            Queue<TreeNode> nextLevel = new LinkedList<>();
            while (!queue.isEmpty()) {
                TreeNode node = queue.poll();
                sum += node.val;
                if (node.left != null) {
                    nextLevel.add(node.left);
                }
                if (node.right != null) {
                    nextLevel.add(node.right);
                }
            }
            record.putIfAbsent(sum, new ArrayList<>());
            record.get(sum).add(level);
            level++;
            queue = nextLevel;
        }

        int max = Integer.MIN_VALUE;
        for (Integer integer : record.keySet()) {
            max = Math.max(max, integer);
        }
        return record.get(max).stream().min(Comparator.naturalOrder()).get();
    }

}
