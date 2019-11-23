package org.jessenpan.leetcode.breadthfirstsearch;

import org.junit.Assert;
import org.junit.Test;

import static org.jessenpan.leetcode.breadthfirstsearch.S1161MaximumLevelSumOfABinaryTree.TreeNode;

/**
 * @author jessenpan
 */
public class S1161MaximumLevelSumOfABinaryTreeTest {

    private S1161MaximumLevelSumOfABinaryTree maximumLevelSumOfABinaryTree = new S1161MaximumLevelSumOfABinaryTree();

    @Test
    public void test1() {
        TreeNode root = new TreeNode(1, new TreeNode(7, new TreeNode(7), new TreeNode(-8)), new TreeNode(0));
        int t = maximumLevelSumOfABinaryTree.maxLevelSum(root);
        Assert.assertEquals(2, t);
    }

    @Test
    public void test2() {
        TreeNode root = new TreeNode(989, null,new TreeNode(10250,new TreeNode(98693),new TreeNode(-89388,null,new TreeNode(-32127))));
        int t = maximumLevelSumOfABinaryTree.maxLevelSum(root);
        Assert.assertEquals(2, t);
    }

}
