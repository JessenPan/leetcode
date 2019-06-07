package org.jessenpan.leetcode.tree;

import org.junit.Test;

import static org.jessenpan.leetcode.tree.S236LowestCommonAncestorOfABinaryTree.*;

/**
 * @author jessenpan
 */
public class S236LowestCommonAncestorOfABinaryTreeTest {

    private S236LowestCommonAncestorOfABinaryTree lowestCommonAncestorOfABinaryTree = new S236LowestCommonAncestorOfABinaryTree();
    
    @Test
    public void test1(){
        TreeNode root = new TreeNode(2,null,new TreeNode(1));
        lowestCommonAncestorOfABinaryTree.lowestCommonAncestor(root,new TreeNode(1),new TreeNode(2));
    }
    
}
