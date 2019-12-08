package org.jessenpan.leetcode.tree;

/**
 * @author jessenpan
 * tag:tree
 */
public class S865SmallestSubtreeWithAllTheDeepestNodes {

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

    public TreeNode subtreeWithAllDeepest(TreeNode root) {
        return null;
    }

}
