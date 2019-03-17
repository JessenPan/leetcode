package org.jessenpan.leetcode;

import org.jessenpan.leetcode.S606ConstructStringFromBinaryTree.TreeNode;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * @author jessenpan
 */
public class S606ConstructStringFromBinaryTreeTest {

    private S606ConstructStringFromBinaryTree constructStringFromBinaryTree = new S606ConstructStringFromBinaryTree();

    @Test
    public void test1() {
        TreeNode node4 = new TreeNode(4);
        TreeNode node2 = new TreeNode(2, node4, null);
        TreeNode node1 = new TreeNode(1, node2, new TreeNode(3));
        String strOfTree = constructStringFromBinaryTree.tree2str(node1);
        assertEquals("1(2(4))(3)", strOfTree);
    }

    @Test
    public void test2() {
        TreeNode node4 = new TreeNode(4);
        TreeNode node2 = new TreeNode(2, null, node4);
        TreeNode node1 = new TreeNode(1, node2, new TreeNode(3));
        String strOfTree = constructStringFromBinaryTree.tree2str(node1);
        assertEquals("1(2()(4))(3)", strOfTree);
    }

}
