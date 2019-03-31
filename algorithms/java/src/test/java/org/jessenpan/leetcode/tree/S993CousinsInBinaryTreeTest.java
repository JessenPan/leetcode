package org.jessenpan.leetcode.tree;

import org.jessenpan.leetcode.S993CousinsInBinaryTree;
import org.jessenpan.leetcode.S993CousinsInBinaryTree.TreeNode;
import org.junit.Test;

import static org.junit.Assert.assertTrue;

/**
 * @author jessenpan
 */
public class S993CousinsInBinaryTreeTest {

    private S993CousinsInBinaryTree cousinsInBinaryTree = new S993CousinsInBinaryTree();

    @Test
    public void test1() {
        TreeNode node2 = new TreeNode(2, null, new TreeNode(4));
        TreeNode node3 = new TreeNode(3, null, new TreeNode(5));
        TreeNode node1 = new TreeNode(1, node2, node3);
        boolean isCousins = cousinsInBinaryTree.isCousins(node1, 5, 4);
        assertTrue(isCousins);
    }

}
