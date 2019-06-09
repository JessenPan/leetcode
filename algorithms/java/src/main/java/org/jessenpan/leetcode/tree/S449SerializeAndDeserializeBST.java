package org.jessenpan.leetcode.tree;

import java.util.ArrayDeque;
import java.util.Queue;

/**
 * @author jessenpan
 * tag:tree
 */
public class S449SerializeAndDeserializeBST {

    public static class TreeNode {

        int val;
        TreeNode left;
        TreeNode right;

        public TreeNode(int x) { val = x; }

        public TreeNode(int x, TreeNode left, TreeNode right) {
            this.val = x;
            this.left = left;
            this.right = right;
        }
    }

    public static class Codec {

        private static final TreeNode EMPTY = new TreeNode(-1);

        private static final String PLACEHOLDER = "_";

        private static final String SEPARATOR = ",";

        public String serialize(TreeNode root) {

            if (root == null) {
                return "";
            }

            StringBuilder sb = new StringBuilder();
            Queue<TreeNode> queue = new ArrayDeque<>();
            queue.add(root);
            while (!queue.isEmpty()) {
                TreeNode node = queue.poll();
                if (node == EMPTY) {
                    sb.append(PLACEHOLDER).append(SEPARATOR);
                    continue;
                }
                sb.append(node.val).append(SEPARATOR);
                queue.offer(node.left == null ? EMPTY : node.left);
                queue.offer(node.right == null ? EMPTY : node.right);
            }
            return sb.toString();
        }

        public TreeNode deserialize(String data) {
            if (data == null || data.length() == 0) {
                return null;
            }

            String[] nodeStrs = data.split(SEPARATOR);
            TreeNode root = new TreeNode(Integer.parseInt(nodeStrs[0]));
            Queue<TreeNode> queue = new ArrayDeque<>();
            queue.add(root);

            int index = 1;
            while (!queue.isEmpty()) {
                if (index == nodeStrs.length) {
                    break;
                }
                TreeNode node = queue.poll();

                String leftStr = nodeStrs[index++];
                if (!PLACEHOLDER.equals(leftStr)) {
                    TreeNode left = new TreeNode(Integer.parseInt(leftStr));
                    node.left = left;
                    queue.offer(left);
                }

                if (index == nodeStrs.length) {
                    break;
                }

                String rightStr = nodeStrs[index++];
                if (!PLACEHOLDER.equals(rightStr)) {
                    TreeNode right = new TreeNode(Integer.parseInt(rightStr));
                    node.right = right;
                    queue.offer(right);
                }

            }
            return root;
        }
    }

}
