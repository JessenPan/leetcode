package org.jessenpan.leetcode.tree;

import org.jessenpan.leetcode.tree.S1008ConstructBinarySearchTreeFromPreorderTraversal.TreeNode;
import org.junit.Test;

/**
 * @author jessenpan
 */
public class S1008ConstructBinarySearchTreeFromPreorderTraversalTest {

    private S1008ConstructBinarySearchTreeFromPreorderTraversal constructBinarySearchTreeFromPreorderTraversal = new S1008ConstructBinarySearchTreeFromPreorderTraversal();

    @Test
    public void test1() {
        TreeNode root = constructBinarySearchTreeFromPreorderTraversal.bstFromPreorder(new int[] { 8, 5, 1, 7, 10, 12 });
    }

    @Test
    public void test2() {
        TreeNode root = constructBinarySearchTreeFromPreorderTraversal.bstFromPreorder(new int[] { 4,2});
    }

}
