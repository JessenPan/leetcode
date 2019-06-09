package org.jessenpan.leetcode.tree;

import org.jessenpan.leetcode.tree.S655PrintBinaryTree.TreeNode;
import org.junit.Assert;
import org.junit.Test;

/**
 * @author jessenpan
 */
public class S655PrintBinaryTreeTest {

    private S655PrintBinaryTree printBinaryTree = new S655PrintBinaryTree();

    @Test
    public void test1() {
        int height = printBinaryTree.countHeight(new TreeNode(1, new TreeNode(2, null, new TreeNode(4)), new TreeNode(3)));
        Assert.assertEquals(3, height);
    }

    @Test
    public void test2() {
        printBinaryTree.printTree(new TreeNode(1, new TreeNode(2, null, new TreeNode(4)), new TreeNode(3)));
    }

    @Test
    public void test3() {
        printBinaryTree.printTree(new TreeNode(1, new TreeNode(2), null));
    }

}
