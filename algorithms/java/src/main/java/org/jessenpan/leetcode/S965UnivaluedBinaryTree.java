package org.jessenpan.leetcode;

import java.util.LinkedList;
import java.util.Queue;

/**
 * @author jessenpan
 * tag:tree
 */
public class S965UnivaluedBinaryTree {

    public class TreeNode {

        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) { val = x; }
    }

    public boolean isUnivalTree(TreeNode root) {
        int theBaseVal = root.val;

        Queue<TreeNode> treeQueue = new LinkedList<>();
        treeQueue.offer(root);
        while (!treeQueue.isEmpty()) {
            TreeNode theElement = treeQueue.poll();
            if (theElement.val != theBaseVal) {
                return false;
            }else {
                if (theElement.left != null) {
                    treeQueue.offer(theElement.left);
                }
                if (theElement.right != null) {
                    treeQueue.offer(theElement.right);
                }
            }
        }
        return true;
    }

}
