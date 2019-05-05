package org.jessenpan.leetcode.tree;

/**
 * @author jessenpan
 * tag:tree
 */
public class S814BinaryTreePruning {

    public static class TreeNode {

        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) { val = x; }
        
        TreeNode(int x,TreeNode left,TreeNode right){
            this.val=x;
            this.left=left;
            this.right=right;
        }
    }

    public TreeNode pruneTree(TreeNode root) {
        boolean hasNodeOfOneValue = hasNodeOfOneValue(root);
        if (!hasNodeOfOneValue) {
            return null;
        }
        return root;
    }

    private boolean hasNodeOfOneValue(TreeNode node) {
        
        if(node==null){
            return false;
        }
        boolean left=hasNodeOfOneValue(node.left);
        if (!left) {
            node.left=null;
        }
        boolean right=hasNodeOfOneValue(node.right);
        if(!right){
            node.right=null;
        }
        return left || right || node.val ==1;
    }
}
