package org.jessenpan.leetcode.tree;

import org.junit.Test;

import static org.jessenpan.leetcode.tree.S106ConstructBinaryTreeFromInorderAndPostorderTraversal.TreeNode;
import static org.junit.Assert.assertEquals;

/**
 * @author jessenpan
 */
public class S106ConstructBinaryTreeFromInorderAndPostorderTraversalTest {

    private S106ConstructBinaryTreeFromInorderAndPostorderTraversal constructBinaryTreeFromInorderAndPostorderTraversal = new S106ConstructBinaryTreeFromInorderAndPostorderTraversal();

    @Test
    public void test1() {
        TreeNode treeNode = constructBinaryTreeFromInorderAndPostorderTraversal.buildTree(new int[] { 9, 3, 15, 20, 7 }, new int[] { 9, 15, 7, 20, 3 });
        assertEquals(3, treeNode.val);
    }

    @Test
    public void test2() {
        TreeNode treeNode = constructBinaryTreeFromInorderAndPostorderTraversal.buildTree(new int[] { 1, 2 }, new int[] { 2, 1 });
        assertEquals(1, treeNode.val);
    }

}
