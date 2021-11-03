package org.jessenpan.leetcode.tree;

import org.jessenpan.leetcode.tree.S662MaximumWidthOfBinaryTree.TreeNode;
import org.junit.Assert;
import org.junit.Test;

/**
 * @author jessenpan
 */
public class S662MaximumWidthOfBinaryTreeTest {

    private S662MaximumWidthOfBinaryTree maximumWidthOfBinaryTree = new S662MaximumWidthOfBinaryTree();

    @Test
    public void test1() {
        TreeNode node = new TreeNode(1, new TreeNode(3, new TreeNode(5), new TreeNode(3)), null);
        int width = maximumWidthOfBinaryTree.widthOfBinaryTree(node);
        Assert.assertEquals(2, width);
    }

    @Test
    public void test2() {
        TreeNode left = new TreeNode(1, new TreeNode(1, new TreeNode(1), null), null);
        TreeNode right = new TreeNode(1, null, new TreeNode(1, null, new TreeNode(1)));
        TreeNode node = new TreeNode(1, left, right);
        int width = maximumWidthOfBinaryTree.widthOfBinaryTree(node);
        Assert.assertEquals(8, width);
    }

}
