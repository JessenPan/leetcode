package org.jessenpan.leetcode.tree;

import org.junit.Assert;
import org.junit.Test;

import static org.jessenpan.leetcode.tree.S124BinaryTreeMaximumPathSum.*;

/**
 * @author jessenpan
 * tag:tree
 */
public class S124BinaryTreeMaximumPathSumTest {

    private S124BinaryTreeMaximumPathSum binaryTreeMaximumPathSum = new S124BinaryTreeMaximumPathSum();

    @Test
    public void test1() {
        TreeNode root = new TreeNode(1, new TreeNode(2), new TreeNode(3));
        int max = binaryTreeMaximumPathSum.maxPathSum(root);
        Assert.assertEquals(6, max);
    }

    @Test
    public void test2() {
        TreeNode root = new TreeNode(-10, new TreeNode(9), new TreeNode(20, new TreeNode(15), new TreeNode(7)));
        int max = binaryTreeMaximumPathSum.maxPathSum(root);
        Assert.assertEquals(42, max);
    }

    @Test
    public void test3() {
        TreeNode root = new TreeNode(-10);
        int max = binaryTreeMaximumPathSum.maxPathSum(root);
        Assert.assertEquals(-10, max);
    }

    @Test
    public void test4() {
        TreeNode root = new TreeNode(-2, new TreeNode(-1), null);
        int max = binaryTreeMaximumPathSum.maxPathSum(root);
        Assert.assertEquals(-1, max);
    }

}
