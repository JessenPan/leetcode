package org.jessenpan.leetcode.tree;

import org.junit.Assert;
import org.junit.Test;

import static org.jessenpan.leetcode.tree.S508MostFrequentSubtreeSum.*;

/**
 * @author jessenpan
 */
public class S508MostFrequentSubtreeSumTest {

    private S508MostFrequentSubtreeSum mostFrequentSubtreeSum = new S508MostFrequentSubtreeSum();

    @Test
    public void test1() {
        TreeNode treeNode = new TreeNode(5, new TreeNode(2), new TreeNode(-3));
        int[] mostArray = mostFrequentSubtreeSum.findFrequentTreeSum(treeNode);
        Assert.assertArrayEquals(new int[] { 2, -3, 4 }, mostArray);
    }

}
