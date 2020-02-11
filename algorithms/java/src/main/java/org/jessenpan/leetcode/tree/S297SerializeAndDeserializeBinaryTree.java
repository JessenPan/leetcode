package org.jessenpan.leetcode.tree;

/**
 * @author jessenpan
 * tag:tree
 */
public class S297SerializeAndDeserializeBinaryTree {

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

    public static class Codec {

        public String serialize(TreeNode root) {
            if (root == null) {
                return "";
            }
            StringBuilder sb = new StringBuilder();
            find(root, sb);
            return sb.toString();
        }

        private void find(TreeNode node, StringBuilder sb) {

            sb.append(node.val).append(",");
            if (node.left == null) {
                sb.append('n').append(',');
            } else {
                find(node.left, sb);
            }
            if (node.right == null) {
                sb.append('n').append(',');
            } else {
                find(node.right, sb);
            }
        }

        public TreeNode deserialize(String data) {
            if (data == null || data.trim().isEmpty()) {
                return null;
            }
            StringBuilder sb = new StringBuilder(data);
            return rebuild(sb);
        }

        private TreeNode rebuild(StringBuilder sb) {
            int idx = sb.indexOf(",");
            String str = sb.substring(0, idx);
            sb.replace(0, idx + 1, "");
            if ("n".equals(str)) {
                return null;
            }else {
                TreeNode node = new TreeNode(Integer.parseInt(str));
                node.left=rebuild(sb);
                node.right = rebuild(sb);
                return node;
            }
        }
    }

}
