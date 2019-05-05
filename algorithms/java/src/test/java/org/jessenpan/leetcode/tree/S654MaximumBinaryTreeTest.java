package org.jessenpan.leetcode.tree;

import org.junit.Assert;
import org.junit.Test;

/**
 * @author jessenpan
 */
public class S654MaximumBinaryTreeTest {

    private S654MaximumBinaryTree maximumBinaryTree = new S654MaximumBinaryTree();

    @Test
    public void test1() {
        S654MaximumBinaryTree.TreeNode root = maximumBinaryTree.constructMaximumBinaryTree(new int[] { 3, 2, 1, 6, 0, 5 });
        Assert.assertEquals(6, root.val);
    }

}
