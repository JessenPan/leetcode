package org.jessenpan.leetcode.breadthfirstsearch;

import java.util.LinkedList;
import java.util.Queue;

/**
 * @author jessenpan
 * tag:breadthFirstSearch
 */
public class S919CompleteBinaryTreeInserter {

    public static class TreeNode {

        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) { val = x; }
    }

    public static class CBTInserter {

        private Queue<TreeNode> queue = new LinkedList<>();

        private TreeNode root;

        public CBTInserter(TreeNode root) {
            this.root = root;
            Queue<TreeNode> record = new LinkedList<>();
            record.offer(root);
            while (!record.isEmpty()) {
                TreeNode node = record.poll();
                if (node.left == null || node.right == null) {
                    queue.offer(node);
                }
                if (node.left != null) {
                    record.offer(node.left);
                }
                if (node.right != null) {
                    record.offer(node.right);
                }
            }
        }

        public int insert(int v) {
            TreeNode newNode = new TreeNode(v);
            queue.offer(newNode);
            if (queue.peek().left == null) {
                queue.peek().left = newNode;
                return queue.peek().val;
            } else {
                queue.peek().right = newNode;
                return queue.poll().val;
            }
        }

        public TreeNode get_root() {
            return this.root;
        }
    }
}
