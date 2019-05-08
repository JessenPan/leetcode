package org.jessenpan.leetcode.depthfirstsearch;

import java.util.*;

/**
 * @author jessenpan
 * tag:depthFisrtSearch
 */
public class S958CheckCompletenessOfABinaryTree {

    public static class TreeNode {

        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) { val = x; }
    }

    public boolean isCompleteTree(TreeNode root) {
        if (root == null) {
            return true;
        }
        int level = 1, sum = 0;
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        while (!queue.isEmpty()) {
            sum=0;
            Queue<TreeNode> nextLevel = new LinkedList<>();
            while (!queue.isEmpty()) {
                TreeNode node = queue.poll();
                sum++;
                if (node.left != null) {
                    nextLevel.offer(node.left);
                }
                if (node.left==null&&node.right != null) {
                    return false;
                }
                if(node.right!=null){
                    nextLevel.offer(node.right);
                }

            }
            queue = nextLevel;
            if (sum != Math.pow(2, level - 1) && !nextLevel.isEmpty()) {
                return false;
            }
            level++;
        }
        return true;
    }

}
