package org.jessenpan.leetcode.tree.S98ValidateBinarySearchTree;

/**
 * @author jessenpan
 */
public class MidOrderTravelSolution {

    Integer preValue = null;


    public boolean isValidBST(TreeNode root) {
        if (root == null) {
            return true;
        }

        return orderTravel(root);
    }

    private boolean orderTravel(TreeNode node) {

        boolean isLegal = true;

        if (node.left != null) {
            isLegal = orderTravel(node.left);
        }
        if(!isLegal){
            return false;
        }

        if (preValue == null) {
            preValue = node.val;
        } else if (node.val < preValue) {
            return false;
        } else {
            preValue = node.val;
        }

        if (node.right != null) {
            return orderTravel(node.right);
        }
        return true;
    }

}
