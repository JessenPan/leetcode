package org.jessenpan.leetcode.tree;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * @author jessenpan
 * tag:tree
 * //TODO Needs to be optimized
 */
public class S637AverageOfLevelsInBinaryTree {

    public static class TreeNode {

        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) { val = x; }
    }

    public List<Double> averageOfLevels(TreeNode root) {
        if (root == null) {
            return Collections.emptyList();
        }
        List<Double> list = new LinkedList<>();
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        list.add((double) root.val);
        while (!queue.isEmpty()) {
            List<Long> theLevelList = new LinkedList<>();
            List<TreeNode> theNextNode = new LinkedList<>();
            while (!queue.isEmpty()) {
                TreeNode node = queue.poll();
                if (node.left != null) {
                    theLevelList.add((long) node.left.val);
                    theNextNode.add(node.left);
                }
                if (node.right != null) {
                    theLevelList.add((long) node.right.val);
                    theNextNode.add(node.right);
                }
            }
            if (theLevelList.size() > 0) {
                list.add(((double) theLevelList.stream().mapToLong(t -> t).sum() / theLevelList.size()));
            }
            if (theNextNode.size() > 0) {
                theNextNode.forEach(queue::offer);
            }
        }
        return list;
    }

}
