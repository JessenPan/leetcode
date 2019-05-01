package org.jessenpan.leetcode.tree;

import org.junit.Test;

import static org.jessenpan.leetcode.tree.S543DiameterOfBinaryTree.TreeNode;
import static org.junit.Assert.assertEquals;

/**
 * @author jessenpan
 */
public class S543DiameterOfBinaryTreeTest {

    private S543DiameterOfBinaryTree diameterOfBinaryTree = new S543DiameterOfBinaryTree();

    @Test
    public void test1() {
        TreeNode node = new TreeNode(1, new TreeNode(2, new TreeNode(4), new TreeNode(5)), new TreeNode(3));
        int diameter = diameterOfBinaryTree.diameterOfBinaryTree(node);
        assertEquals(3,diameter);
    }

}
