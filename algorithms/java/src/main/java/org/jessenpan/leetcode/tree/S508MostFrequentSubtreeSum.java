package org.jessenpan.leetcode.tree;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author jessenpan
 * tag:tree
 */
public class S508MostFrequentSubtreeSum {

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

    private Map<Integer, Integer> record = new HashMap<>();

    public int[] findFrequentTreeSum(TreeNode root) {
        calTreeSum(root);
        int maxTimes = 0;
        List<Integer> maxVals = new ArrayList<>();
        for (Map.Entry<Integer, Integer> entry : record.entrySet()) {
            if (entry.getValue() > maxTimes) {
                maxVals.clear();
                maxVals.add(entry.getKey());
                maxTimes = entry.getValue();
            } else if (entry.getValue() == maxTimes) {
                maxVals.add(entry.getKey());
            }
        }
        return maxVals.stream().mapToInt(t -> t).toArray();
    }

    private int calTreeSum(TreeNode node) {
        if (node == null) {
            return 0;
        }
        int leftSum = calTreeSum(node.left);
        int rightSum = calTreeSum(node.right);
        int sum = leftSum + rightSum + node.val;
        Integer cnt = record.get(sum);
        cnt = cnt == null ? 1 : cnt + 1;
        record.put(sum, cnt);
        return sum;
    }

}
