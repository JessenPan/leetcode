package org.jessenpan.leetcode.tree;

import org.jessenpan.leetcode.tree.S671SecondMinimumNodeInABinaryTree.TreeNode;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * @author jessenpan
 */
public class S671SecondMinimumNodeInABinaryTreeTest {

    private S671SecondMinimumNodeInABinaryTree secondMinimumNodeInABinaryTree = new S671SecondMinimumNodeInABinaryTree();

    @Test
    public void test1() {
        TreeNode node5 = new TreeNode(5, new TreeNode(5), new TreeNode(7));
        TreeNode node2 = new TreeNode(2, new TreeNode(2), node5);
        int secondMin = secondMinimumNodeInABinaryTree.findSecondMinimumValue(node2);
        assertEquals(5, secondMin);
    }

    @Test
    public void test2() {
        TreeNode node5 = new TreeNode(5, new TreeNode(8), new TreeNode(5));
        int secondMin = secondMinimumNodeInABinaryTree.findSecondMinimumValue(node5);
        assertEquals(8, secondMin);
    }

}
